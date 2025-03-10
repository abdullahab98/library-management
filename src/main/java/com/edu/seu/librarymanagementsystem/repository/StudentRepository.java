package com.edu.seu.librarymanagementsystem.repository;

import com.edu.seu.librarymanagementsystem.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends MongoRepository<Student, String> {
    Student findByStudentId(int id);
}
