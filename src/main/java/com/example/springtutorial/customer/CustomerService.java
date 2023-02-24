package com.example.springtutorial.customer;

import lombok.AllArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    private final CustomerRepo customerRepo;

    public CustomerService(@Qualifier("fake") CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }

//    public Customer getCustomer() {
//        return customerRepository.getCustomer();
//    }

    public List<Customer> getCustomers() {
        return customerRepo.getCustomers();
    }
}
