package com.example.reactive.mongodb.repository.normalized.manualRef;

import com.example.reactive.mongodb.entity.normalized.manualRef.ManualRefBook;
import com.example.reactive.mongodb.entity.normalized.manualRef.ManualRefPublisher;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface ManualRefBookRepository extends ReactiveMongoRepository<ManualRefBook, Long>, CustomManualRefBookRepository{
    Flux<ManualRefBook> findByManualRefPublisherId(Long id);
}
