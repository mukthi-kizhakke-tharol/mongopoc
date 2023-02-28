package com.example.reactive.mongodb.repository.normalized.declarativeManualRef;

import com.example.reactive.mongodb.entity.normalized.declarativeManualRef.DocumentReferenceBook;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface DocumentReferenceBookRepository extends ReactiveMongoRepository<DocumentReferenceBook, Long> {
}
