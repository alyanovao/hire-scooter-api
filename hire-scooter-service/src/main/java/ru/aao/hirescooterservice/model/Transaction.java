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
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "status", nullable = true)
    @Enumerated(EnumType.STRING)
    private TransactionStatusType status;

    @Column(name = "reserve_amount", nullable = true)
    private BigDecimal reserveAmount;

    @Column(name = "amount")
    private BigDecimal amount;

}
