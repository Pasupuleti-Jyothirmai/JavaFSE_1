package org.example.basicspringapplication;

import org.example.basicspringapplication.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BasicSpringApplication implements CommandLineRunner {

    @Autowired
    private GreetingService greetingService;

    public static void main(String[] args) {
        SpringApplication.run(BasicSpringApplication.class, args);
    }

    @Override
    public void run(String... args) {
        greetingService.greet();
    }
}