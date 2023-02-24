package com.example.springtutorial.customer;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Component(value = "fake")
public class CustomerFakeRepository implements CustomerRepo{

    @Override
    public List<Customer> getCustomers() {
        return List.of(
                new Customer(1L, "Casey"),
                new Customer(2L, "Jamil")
        );
    }
}
