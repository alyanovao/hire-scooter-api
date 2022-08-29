package ru.aao.hirescooterservice.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import ru.aao.hirescooterservice.dto.PriceDto;

import java.util.List;

@FeignClient(name = "hire-scooter-price")
public interface PriceServiceProxy {

    @GetMapping(value = "/price-api/prices")
    public List<PriceDto> getPrices();
}
