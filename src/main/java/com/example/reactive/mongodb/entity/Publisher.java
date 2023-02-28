package com.example.reactive.mongodb.entity;

import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

public class Publisher {

    private String name;

    //@DocumentReference
    private List<Book> books;

    public Publisher() {
    }

    public Publisher(String name, List<Book> books) {
        this.name = name;
        this.books = books;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
