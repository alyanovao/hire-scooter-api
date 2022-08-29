package ru.aao.hirescooterservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.aao.hirescooterservice.model.Transaction;

public interface TransactionDao extends JpaRepository<Transaction, Long> {
}
