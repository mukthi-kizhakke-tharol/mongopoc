package com.example.reactive.mongodb.repository.normalized.declarativeManualRef;

import com.example.reactive.mongodb.entity.normalized.declarativeManualRef.DocumentReferenceBook;
import com.example.reactive.mongodb.entity.normalized.declarativeManualRef.DocumentReferencePublisher;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface DocumentReferencePublisherRepository extends ReactiveMongoRepository<DocumentReferencePublisher, Long> {
}
