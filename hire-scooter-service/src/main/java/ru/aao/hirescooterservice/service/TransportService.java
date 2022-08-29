package ru.aao.hirescooterservice.service;


import ru.aao.hirescooterservice.model.Transport;

import java.util.List;

public interface TransportService {
    List<Transport> findAll();
    Transport getById(Long id);
    Transport save(Transport transport);
    void delete(Long id);}
