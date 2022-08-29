package ru.aao.hirescooterservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.aao.hirescooterservice.model.Transaction;
import ru.aao.hirescooterservice.repository.TransactionDao;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/service-api")
public class TransactionController {

    private final TransactionDao transactionDao;

    @GetMapping(value = "/transactions")
    public ResponseEntity<List<Transaction>> findAllTransactions() {
        return new ResponseEntity<List<Transaction>>(transactionDao.findAll(), HttpStatus.OK);

    }
}
