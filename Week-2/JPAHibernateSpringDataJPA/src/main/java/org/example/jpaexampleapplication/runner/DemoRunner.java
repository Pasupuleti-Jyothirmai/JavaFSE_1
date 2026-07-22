package org.example.jpaexampleapplication.runner;

import org.example.jpaexampleapplication.entity.Student;
import org.example.jpaexampleapplication.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DemoRunner implements CommandLineRunner {

    private final StudentRepository repository;

    public DemoRunner(StudentRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) {

        repository.save(new Student(1, "Jyothirmai"));

        System.out.println("Student Saved");

        repository.findAll().forEach(System.out::println);
    }
}