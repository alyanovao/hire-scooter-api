package ru.aao.hirescooterprice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.aao.hirescooterprice.model.Price;

public interface PriceDao extends JpaRepository<Price, Long> {
}
