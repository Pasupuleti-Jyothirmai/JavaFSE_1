package org.example.dependencyinjection.repository;

import org.springframework.stereotype.Repository;

@Repository
public class CustomerRepository {

    public String getCustomer() {
        return "Customer Details";
    }
}