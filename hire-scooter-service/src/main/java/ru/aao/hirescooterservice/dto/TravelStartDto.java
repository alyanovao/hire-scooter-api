package ru.aao.hirescooterservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TravelStartDto {
    private Long customerId;
    private Long transportId;
}
