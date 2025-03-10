package com.edu.seu.librarymanagementsystem.controller;

import com.edu.seu.librarymanagementsystem.service.BookService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("borrow")
public class BorrowController {
    private final BookService bookService;

    public BorrowController(BookService bookService) {
        this.bookService = bookService;
    }

}
