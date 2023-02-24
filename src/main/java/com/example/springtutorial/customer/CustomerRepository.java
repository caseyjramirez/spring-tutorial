package com.example.springtutorial.customer;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Primary
public class CustomerRepository implements CustomerRepo {

    public Customer getCustomer() {
        return new Customer(
                1L, "Casey"
        );
    }

    @Override
    public List<Customer> getCustomers() {
        return List.of(
                new Customer(1L, "Todo! Hook up to DB")
        );
    }
}
