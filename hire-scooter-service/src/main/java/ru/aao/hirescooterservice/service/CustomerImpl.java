package ru.aao.hirescooterservice.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.aao.hirescooterservice.model.Customer;
import ru.aao.hirescooterservice.repository.CustomerDao;

@RequiredArgsConstructor
@Service
public class CustomerImpl implements CustomerService {

    private final CustomerDao customerDao;

    @Override
    @Transactional
    public Customer addCustomer(Customer customer) {
        customerDao.save(customer);
        return customer;

    }
}
