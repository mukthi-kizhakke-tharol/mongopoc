package com.example.reactive.mongodb.controller.normalized.dbRef;

import com.example.reactive.mongodb.entity.Book;
import com.example.reactive.mongodb.entity.normalized.dbRef.DBRefBook;
import com.example.reactive.mongodb.entity.normalized.dbRef.DBRefPublisher;
import com.example.reactive.mongodb.repository.normalized.dbRef.DBRefPublisherRepository;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value = "/api/dbref/publisher")
public class DBRefPublisherController {

    private final DBRefPublisherRepository dbRefPublisherRepository;

    public DBRefPublisherController(DBRefPublisherRepository dbRefPublisherRepository) {
        this.dbRefPublisherRepository = dbRefPublisherRepository;
    }

    @PostMapping
    public Mono<DBRefPublisher> createDBRefPublisher(@RequestBody DBRefPublisher dbRefPublisher) {
        return dbRefPublisherRepository.save(dbRefPublisher);
    }

    @GetMapping
    public Flux<DBRefPublisher> findAll() {
        return dbRefPublisherRepository.findAll();
    }
}
