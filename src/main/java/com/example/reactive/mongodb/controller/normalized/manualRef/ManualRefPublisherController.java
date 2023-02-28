package com.example.reactive.mongodb.controller.normalized.manualRef;

import com.example.reactive.mongodb.entity.normalized.dbRef.DBRefPublisher;
import com.example.reactive.mongodb.entity.normalized.manualRef.ManualRefBookResult;
import com.example.reactive.mongodb.entity.normalized.manualRef.ManualRefPublisher;
import com.example.reactive.mongodb.repository.normalized.manualRef.ManualRefPublisherRepository;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value = "/api/manual/publisher")
public class ManualRefPublisherController {

    private final ManualRefPublisherRepository manualRefPublisherRepository;

    public ManualRefPublisherController(ManualRefPublisherRepository manualRefPublisherRepository) {
        this.manualRefPublisherRepository = manualRefPublisherRepository;
    }

    @PostMapping
    public Mono<ManualRefPublisher> createDBRefPublisher(@RequestBody ManualRefPublisher publisher) {
        return manualRefPublisherRepository.save(publisher);
    }

    @GetMapping
    public Flux<ManualRefPublisher> findAll() {
        return manualRefPublisherRepository.findAll();
    }

}
