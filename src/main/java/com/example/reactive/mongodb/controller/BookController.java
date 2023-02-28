package com.example.reactive.mongodb.controller;

import com.example.reactive.mongodb.entity.Book;
import com.example.reactive.mongodb.entity.Member;
import com.example.reactive.mongodb.repository.BookRepository;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value = "/api/book")
public class BookController {

    private final BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @PostMapping
    public Mono<Book> createMember(@RequestBody Book book) {
        return bookRepository.save(book);
    }

    @GetMapping
    public Flux<Book> findAll() {
        return bookRepository.findAll();
    }

}
