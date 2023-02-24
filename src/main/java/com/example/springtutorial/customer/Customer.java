package com.example.springtutorial.customer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
public class Customer {
    private final Long id;
    private final String name;
}
