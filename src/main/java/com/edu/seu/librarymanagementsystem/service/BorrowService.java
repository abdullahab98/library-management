package com.edu.seu.librarymanagementsystem.service;

import com.edu.seu.librarymanagementsystem.repository.BorrowRepository;
import org.springframework.stereotype.Service;

@Service
public class BorrowService {
    private final BorrowRepository borrowRepository;

    public BorrowService(BorrowRepository borrowRepository) {
        this.borrowRepository = borrowRepository;
    }
}
