package org.example.springdatajpa.runner;

import org.example.springdatajpa.entity.Employee;
import org.example.springdatajpa.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final EmployeeRepository repository;

    public DataLoader(EmployeeRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) {

        repository.save(new Employee(101, "John", 50000));

        System.out.println("Employee Saved Successfully");

        repository.findAll().forEach(employee ->
                System.out.println(employee.getId() + " "
                        + employee.getName() + " "
                        + employee.getSalary()));
    }
}