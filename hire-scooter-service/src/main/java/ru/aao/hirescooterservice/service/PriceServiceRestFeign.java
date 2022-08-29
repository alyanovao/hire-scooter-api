package ru.aao.hirescooterservice.service;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;
import ru.aao.hirescooterservice.dto.PriceDto;
import ru.aao.hirescooterservice.feign.PriceServiceProxy;

import java.util.List;

@Service
@RequiredArgsConstructor
@ConditionalOnProperty(name = "clientType", havingValue = "feign")
public class PriceServiceRestFeign implements PriceService {

    private final PriceServiceProxy priceService;

    @Override
    public List<PriceDto> getPrice() {
        List<PriceDto> prices = priceService.getPrices();
        return prices;
    }
}
