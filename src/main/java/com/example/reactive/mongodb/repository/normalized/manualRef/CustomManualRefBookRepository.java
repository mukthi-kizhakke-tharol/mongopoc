package com.example.reactive.mongodb.repository.normalized.manualRef;

import com.example.reactive.mongodb.entity.normalized.manualRef.ManualRefBook;
import com.example.reactive.mongodb.entity.normalized.manualRef.ManualRefBookResult;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CustomManualRefBookRepository {

    Flux<ManualRefBookResult> findByLookUp();
}
