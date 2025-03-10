package com.edu.seu.librarymanagementsystem.controller;

import com.edu.seu.librarymanagementsystem.model.Book;
import com.edu.seu.librarymanagementsystem.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:5173/")
@RestController
@RequestMapping("book")
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping("save")
    public Book saveBook(@RequestBody Book book){
        Book book1 =new Book();
        book1.setBookId(book.getBookId());
        book1.setIsbn(book.getIsbn());
        book1.setTitle(book.getTitle());
        book1.setEdition(book.getEdition());
        book1.setGenere(book.getGenere());
        book1.setPublicationYear(book.getPublicationYear());
        book1.setAuthors(book.getAuthors());
        book1.setQuantity(book.getQuantity());
        return bookService.save(book1);
    }
    @PutMapping("update")
    public Book updateBook(@RequestBody Book book){
        return bookService.updateBook(book);
    }
//    @GetMapping("test")
//    public String test(){
//        return "test";
//    }
    @GetMapping("get-all")
    public List<Book> getAllBooks(){
        return bookService.getAll();
    }
    @DeleteMapping("delete/{id}")
    public void deleteBook(@PathVariable String id){
        bookService.deleteBook(id);
    }
}
