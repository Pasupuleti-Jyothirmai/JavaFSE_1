package org.example.jpaexampleapplication.repository;

import org.example.jpaexampleapplication.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}