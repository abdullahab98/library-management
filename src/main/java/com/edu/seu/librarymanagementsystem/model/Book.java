package com.edu.seu.librarymanagementsystem.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
@Document(collection = "book")
public class Book implements Serializable {
    @Id
    private String id;
    private int bookId;
    @Indexed(unique = true)
    private String ISBN;
    private String title;
    private String edition;
    private String publicationYear;
    private String genere;
    private List<String> authors = new ArrayList<>();
    @Indexed(unique = true)
    private int quantity;

    public Book() {
    }

    public Book(String id, int bookId, String ISBN, String title, String edition, String publicationYear, String genere, List<String> authors, int quantity) {
        this.id = id;
        this.bookId = bookId;
        this.ISBN = ISBN;
        this.title = title;
        this.edition = edition;
        this.publicationYear = publicationYear;
        this.genere = genere;
        this.authors = authors;
        this.quantity = quantity;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public String getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(String publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }


    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
