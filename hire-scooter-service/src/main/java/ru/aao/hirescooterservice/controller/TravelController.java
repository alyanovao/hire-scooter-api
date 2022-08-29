package ru.aao.hirescooterservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.aao.hirescooterservice.model.Travel;
import ru.aao.hirescooterservice.dto.TravelStartDto;
import ru.aao.hirescooterservice.service.TravelService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/service-api")
public class TravelController {

    private final TravelService travelService;

    @GetMapping(value = "/travels")
    public ResponseEntity<List<Travel>> getAllTravels() {
        return new ResponseEntity<>(travelService.findAll(), HttpStatus.OK);
    }

    @PostMapping(value = "/startTravel")
    public ResponseEntity<?> addTravel(@RequestBody TravelStartDto dto) {
        travelService.startTravel(dto.getCustomerId(), dto.getTransportId());
        return new ResponseEntity(HttpStatus.OK);
    }

    @PostMapping(value = "/finishTravel/{id}")
    public ResponseEntity<?> finishTravel(@PathVariable Long id) {
        travelService.finishTravel(id);
        return new ResponseEntity(HttpStatus.OK);
    }

}
