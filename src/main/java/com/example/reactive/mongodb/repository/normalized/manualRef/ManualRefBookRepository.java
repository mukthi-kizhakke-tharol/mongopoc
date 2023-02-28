package com.example.reactive.mongodb.repository.normalized.manualRef;

import com.example.reactive.mongodb.entity.normalized.manualRef.ManualRefBook;
import com.example.reactive.mongodb.entity.normalized.manualRef.ManualRefPublisher;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ManualRefBookRepository extends ReactiveMongoRepository<ManualRefBook, Long> {
}
