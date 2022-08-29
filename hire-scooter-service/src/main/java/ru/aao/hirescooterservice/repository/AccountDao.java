package ru.aao.hirescooterservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.aao.hirescooterservice.model.Account;

public interface AccountDao extends JpaRepository<Account, Long> {
}
