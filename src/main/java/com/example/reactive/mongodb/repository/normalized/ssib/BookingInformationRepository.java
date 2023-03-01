package com.example.reactive.mongodb.repository.normalized.ssib;

import com.example.reactive.mongodb.entity.normalized.ssib.BookingInformation;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface BookingInformationRepository extends ReactiveMongoRepository<BookingInformation, String> {
}
