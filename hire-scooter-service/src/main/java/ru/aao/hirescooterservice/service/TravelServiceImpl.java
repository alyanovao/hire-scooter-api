package ru.aao.hirescooterservice.service;

import lombok.RequiredArgsConstructor;
import lombok.val;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.aao.hirescooterservice.dto.PriceDto;
import ru.aao.hirescooterservice.exception.NoFoundPriceException;
import ru.aao.hirescooterservice.exception.NoFoundTravelException;
import ru.aao.hirescooterservice.model.*;
import ru.aao.hirescooterservice.repository.TravelDao;

import java.math.BigDecimal;
import java.util.List;

@RequiredArgsConstructor
@Service
public class TravelServiceImpl implements TravelService {

    private final TransportService transportService;
    private final TransactionService transactionService;
    private final PriceService priceService;
    private final TravelDao travelDao;

    @Override
    public List<Travel> findAll() {
        return travelDao.findAll();
    }

    @Override
    @Transactional
    public Travel startTravel(Long customerId, Long transportId) {
        val transport = transportService.getById(transportId);
        if (transport.getStatus().equalsIgnoreCase(TransportStatusType.ACTIVE.name())) {

            PriceDto defaultPrice;
            val price = priceService.getPrice()
                    .stream()
                    .filter(
                            priceDto -> transport.getType().equalsIgnoreCase(priceDto.getTransportType())
                    )
                    .findFirst()
                    .orElseThrow(() -> new NoFoundPriceException("Could not found price for start travel"));

            val transaction = new Transaction(0L, TransactionStatusType.RESERVE, price.getAmount(), new BigDecimal(0.00));
            val saveTransaction = transactionService.save(transaction);
            val travel = new Travel(0L, TravelStatusType.STARTED, customerId, transport, null, null, saveTransaction);
            travelDao.save(travel);
            return travel;
        }
        throw new NoFoundTravelException("Not valid status for start travel");
    }

    @Override
    @Transactional
    public Travel finishTravel(Long id) {
        val travel = travelDao.findById(id).orElseThrow(NoFoundTravelException::new);
        val transaction = travel.getTransactions();
        transaction.setStatus(TransactionStatusType.PAID);
        transaction.setAmount(new BigDecimal(50));
        transaction.setReserveAmount(new BigDecimal(0));
        travel.setTransactions(transaction);
        travel.setStatus(TravelStatusType.FINISH);
        travelDao.save(travel);
        return travel;
    }
}
