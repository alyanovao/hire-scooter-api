package ru.aao.hirescooterservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.aao.hirescooterservice.model.LocationHistory;

public interface LocationHistoryDao extends JpaRepository<LocationHistory, Long> {
}
