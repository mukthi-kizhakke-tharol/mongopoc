package com.example.reactive.mongodb.repository.normalized.manualRef;

import com.example.reactive.mongodb.entity.normalized.dbRef.DBRefPublisher;
import com.example.reactive.mongodb.entity.normalized.manualRef.ManualRefPublisher;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ManualRefPublisherRepository extends ReactiveMongoRepository<ManualRefPublisher, Long> {
}
