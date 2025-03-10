package com.edu.seu.librarymanagementsystem.service;

import com.edu.seu.librarymanagementsystem.model.Student;
import com.edu.seu.librarymanagementsystem.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
    public Student getStudentById(int id) {
        return studentRepository.findByStudentId(id);
    }
}
