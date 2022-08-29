package ru.aao.hirescooterprice.model;

import lombok.AllArgsConstructor;
import lombok.Generated;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Entity
@Table(name = "prices")
public class Price {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "transport_type")
    @Enumerated(EnumType.STRING)
    private TransportType transportType;

    @Column(name = "travel_amount")
    private BigDecimal travelAmount;
}
