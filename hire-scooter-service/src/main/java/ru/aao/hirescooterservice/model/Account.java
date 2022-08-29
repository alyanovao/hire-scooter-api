package ru.aao.hirescooterservice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long accountNumber;

    @Column(name = "customer_id", nullable = false)
    private Long customerId;

    @Column(name = "amount", nullable = false)
    private BigDecimal amount;
}
