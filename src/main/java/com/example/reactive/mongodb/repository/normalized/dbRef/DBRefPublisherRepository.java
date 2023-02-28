package com.example.reactive.mongodb.repository.normalized.dbRef;

import com.example.reactive.mongodb.entity.Member;
import com.example.reactive.mongodb.entity.normalized.dbRef.DBRefBook;
import com.example.reactive.mongodb.entity.normalized.dbRef.DBRefPublisher;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface DBRefPublisherRepository extends ReactiveMongoRepository<DBRefPublisher, Long> {
}
