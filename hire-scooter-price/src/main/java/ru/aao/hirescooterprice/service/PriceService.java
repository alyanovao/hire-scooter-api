package ru.aao.hirescooterprice.service;

import ru.aao.hirescooterprice.model.Price;

import java.util.List;

public interface PriceService {
    List<Price> findAll();
}
