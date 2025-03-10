package com.edu.seu.librarymanagementsystem.controller;

import com.edu.seu.librarymanagementsystem.model.Student;
import com.edu.seu.librarymanagementsystem.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("student")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    @GetMapping("get-all")
    public List<Student> getAll() {
        return studentService.getAllStudents();
    }
    @GetMapping("get-by-id/{studentId}")
    public Student getById(@PathVariable int studentId) {
        return studentService.getStudentById(studentId);
    }
}
