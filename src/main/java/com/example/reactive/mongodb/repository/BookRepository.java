package com.example.reactive.mongodb.repository;

import com.example.reactive.mongodb.entity.Book;
import com.example.reactive.mongodb.entity.Member;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface BookRepository extends ReactiveMongoRepository<Book, ObjectId> {
}
