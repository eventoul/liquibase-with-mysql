package com.mysql.liquibase.mysql.controller;

import com.mysql.liquibase.mysql.dao.StudentRepository;
import com.mysql.liquibase.mysql.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    private final  StudentRepository studentRepository;

    public StudentController(StudentRepository repository) {
        this.studentRepository = repository;
    }

    @GetMapping("/students")
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }
}
