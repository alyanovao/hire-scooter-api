package ru.aao.hirescooterservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.aao.hirescooterservice.model.Transport;

public interface TransportDao extends JpaRepository<Transport, Long> {
}
