package ru.aao.hirescooterservice.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PriceDto {
    private Long id;

    private String transportType;

    @JsonProperty("travelAmount")
    private BigDecimal amount;
}
