package ru.aao.hirescooterservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.aao.hirescooterservice.model.Travel;

public interface TravelDao extends JpaRepository<Travel, Long> {
}
