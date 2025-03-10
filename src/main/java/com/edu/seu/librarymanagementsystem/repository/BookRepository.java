package com.edu.seu.librarymanagementsystem.repository;

import com.edu.seu.librarymanagementsystem.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BookRepository extends MongoRepository<Book,String> {
    Optional<Book> findByBookId(int id);
}
