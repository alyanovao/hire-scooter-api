package ru.aao.hirescooterservice.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.aao.hirescooterservice.model.Transaction;
import ru.aao.hirescooterservice.repository.TransactionDao;

@Service
@RequiredArgsConstructor
public class TransactionServiceImpl implements TransactionService {

    private final TransactionDao transactionDao;

    @Override
    @Transactional
    public Transaction save(Transaction transaction) {
        return transactionDao.save(transaction);
    }
}
