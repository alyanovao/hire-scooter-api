package ru.aao.hirescooterservice.service;

import lombok.RequiredArgsConstructor;
import lombok.val;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.aao.hirescooterservice.exception.NoFoundTransportException;
import ru.aao.hirescooterservice.model.Transport;
import ru.aao.hirescooterservice.repository.TransportDao;

import java.util.List;

@RequiredArgsConstructor
@Service
public class TransportImpl implements TransportService {

    public final TransportDao transportDao;

    @Override
    public List<Transport> findAll() {
        return transportDao.findAll();
    }

    @Override
    public Transport getById(Long id) {
        return transportDao.findById(id).orElseThrow(NoFoundTransportException::new);
    }

    @Override
    @Transactional
    public Transport save(Transport transport) {
        transportDao.save(transport);
        return transport;
    }

    @Override
    @Transactional
    public void delete(Long id) {
        val transport = transportDao.findById(id).orElseThrow(NoFoundTransportException::new);
        transportDao.delete(transport);
    }
}
