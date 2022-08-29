package ru.aao.hirescooterservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.aao.hirescooterservice.model.Customer;

public interface CustomerDao extends JpaRepository<Customer, Long> {
}
