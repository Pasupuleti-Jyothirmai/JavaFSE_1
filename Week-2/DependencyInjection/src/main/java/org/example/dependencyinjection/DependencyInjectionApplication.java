package org.example.dependencyinjection;

import org.example.dependencyinjection.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DependencyInjectionApplication implements CommandLineRunner {

    @Autowired
    private CustomerService customerService;

    public static void main(String[] args) {
        SpringApplication.run(DependencyInjectionApplication.class, args);
    }

    @Override
    public void run(String... args) {
        customerService.displayCustomer();
    }
}