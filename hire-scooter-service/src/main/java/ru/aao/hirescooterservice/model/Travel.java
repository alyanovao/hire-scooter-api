package ru.aao.hirescooterservice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.joda.time.DateTime;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Travel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private TravelStatusType status;

    @Column(name = "customerId")
    private Long customerId;

    @ManyToOne
    @JoinColumn(name = "transport")
    private Transport transport;

    @Column(name = "start_travel")
    private DateTime startTravel;

    @Column(name = "end_travel")
    private DateTime endTravel;

    @ManyToOne
    @JoinColumn(name = "transaction")
    private Transaction transactions;

}
