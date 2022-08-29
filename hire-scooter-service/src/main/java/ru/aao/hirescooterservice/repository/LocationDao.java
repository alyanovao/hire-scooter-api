package ru.aao.hirescooterservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.aao.hirescooterservice.model.Location;

public interface LocationDao extends JpaRepository<Location, Long> {
}
