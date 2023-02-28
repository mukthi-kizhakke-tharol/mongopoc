package com.example.reactive.mongodb.controller.normalized.dbRef;

import com.example.reactive.mongodb.entity.normalized.dbRef.DBRefBook;
import com.example.reactive.mongodb.entity.normalized.dbRef.DBRefPublisher;
import com.example.reactive.mongodb.repository.normalized.dbRef.DBRefBookRepository;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value = "/api/dbref/book")
public class DBRefBookController {

    private final DBRefBookRepository dbRefBookRepository;

    public DBRefBookController(DBRefBookRepository dbRefBookRepository) {
        this.dbRefBookRepository = dbRefBookRepository;
    }

    @PostMapping
    public Mono<DBRefBook> createDBRefBook(@RequestBody DBRefBook dbRefBook) {
        return dbRefBookRepository.save(dbRefBook);
    }

    @GetMapping
    public Flux<DBRefBook> findAll() {
        return dbRefBookRepository.findAll();
    }
}
