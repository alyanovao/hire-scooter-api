package ru.aao.hirescooterprice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.aao.hirescooterprice.model.Price;
import ru.aao.hirescooterprice.service.PriceService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/price-api")
class PriceController {

    private final PriceService priceService;

    @GetMapping(value = "/prices")
    public ResponseEntity<List<Price>> getPrices() {
        return new ResponseEntity<>(priceService.findAll(), HttpStatus.OK);
    }
}
