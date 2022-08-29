package ru.aao.hirescooterservice.service;

import ru.aao.hirescooterservice.dto.PriceDto;

import java.util.List;

public interface PriceService {
    List<PriceDto> getPrice();
}
