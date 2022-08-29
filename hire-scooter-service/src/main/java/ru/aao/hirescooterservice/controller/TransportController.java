package ru.aao.hirescooterservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.aao.hirescooterservice.model.Transport;
import ru.aao.hirescooterservice.service.TransportService;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/service-api")
public class TransportController {
    private final TransportService transportService;

    @GetMapping(value = "/transports")
    public ResponseEntity<List<Transport>> getAllTransport() {
        return new ResponseEntity<>(transportService.findAll(), HttpStatus.OK);
    }

    @PostMapping(value = "/transport")
    public ResponseEntity<?> saveTransport(@RequestBody Transport transport) {
        transportService.save(transport);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping(value = "/transport/{id}")
    public ResponseEntity<?> deleteTransport(@PathVariable Long id) {
        transportService.delete(id);
        return ResponseEntity.ok().build();
    }
}
