package ru.aao.hirescooterservice.service;

import ru.aao.hirescooterservice.model.Travel;

import java.util.List;

public interface TravelService {
    List<Travel> findAll();
    Travel startTravel(Long customerId, Long TransportId);
    Travel finishTravel(Long id);
}
