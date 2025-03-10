package com.edu.seu.librarymanagementsystem.controller;

import com.edu.seu.librarymanagementsystem.service.StudentService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
}
