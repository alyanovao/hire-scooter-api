package ru.aao.hirescooterprice.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.aao.hirescooterprice.model.Price;
import ru.aao.hirescooterprice.repository.PriceDao;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PriceServiceImpl implements PriceService {

    private final PriceDao priceDao;

    @Override
    public List<Price> findAll() {
        return priceDao.findAll();
    }
}
