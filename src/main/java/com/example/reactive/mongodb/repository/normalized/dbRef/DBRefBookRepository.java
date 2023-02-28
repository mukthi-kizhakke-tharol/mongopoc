package com.example.reactive.mongodb.repository.normalized.dbRef;

import com.example.reactive.mongodb.entity.normalized.dbRef.DBRefBook;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface DBRefBookRepository extends ReactiveMongoRepository<DBRefBook, Long> {
}
