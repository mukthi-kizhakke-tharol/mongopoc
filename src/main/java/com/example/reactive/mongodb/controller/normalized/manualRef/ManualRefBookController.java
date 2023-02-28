package com.example.reactive.mongodb.controller.normalized.manualRef;

import com.example.reactive.mongodb.entity.normalized.dbRef.DBRefBook;
import com.example.reactive.mongodb.entity.normalized.manualRef.ManualRefBook;
import com.example.reactive.mongodb.repository.normalized.manualRef.ManualRefBookRepository;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value = "/api/manual/book")
public class ManualRefBookController {

    private final ManualRefBookRepository manualRefBookRepository;

    public ManualRefBookController(ManualRefBookRepository manualRefBookRepository) {
        this.manualRefBookRepository = manualRefBookRepository;
    }

    @PostMapping
    public Mono<ManualRefBook> createDBRefBook(@RequestBody ManualRefBook manualRefBook) {
        return manualRefBookRepository.save(manualRefBook);
    }

    @GetMapping
    public Flux<ManualRefBook> findAll() {
        return manualRefBookRepository.findAll();
    }
}
