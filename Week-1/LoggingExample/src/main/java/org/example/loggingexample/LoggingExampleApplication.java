package org.example.loggingexample;

import org.example.loggingexample.service.LoggingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoggingExampleApplication implements CommandLineRunner {

    @Autowired
    private LoggingService loggingService;

    public static void main(String[] args) {
        SpringApplication.run(LoggingExampleApplication.class, args);
    }

    @Override
    public void run(String... args) {
        loggingService.execute();
    }
}