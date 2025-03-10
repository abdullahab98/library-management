package com.edu.seu.librarymanagementsystem.service;

import com.edu.seu.librarymanagementsystem.model.Book;
import com.edu.seu.librarymanagementsystem.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    public Book save(Book book){
        return bookRepository.save(book);
    }
    public List<Book> getAll(){
        return bookRepository.findAll();
    }
    public Book findById(int id){
        Optional<Book> book = bookRepository.findByBookId(id);
        if (book.isEmpty()){
            return null;
        }
        return book.get();
    }
    public Book updateBook( Book book){
        Book book1 = findById(book.getBookId());
        book1.setTitle(book.getTitle());
        book1.setCopyId(book.getCopyId());
        book1.setAuthor(book.getAuthor());
        book1.setQuantity(book.getQuantity());
        return bookRepository.save(book1);
    }

}
