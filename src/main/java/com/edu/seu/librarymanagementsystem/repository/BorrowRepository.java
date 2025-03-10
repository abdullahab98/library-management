package com.edu.seu.librarymanagementsystem.repository;

import com.edu.seu.librarymanagementsystem.model.Borrow;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BorrowRepository extends MongoRepository<Borrow, String> {
}
