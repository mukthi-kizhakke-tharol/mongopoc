package com.example.reactive.mongodb.repository.normalized.ssib;

import com.example.reactive.mongodb.entity.normalized.ssib.BookingInformation;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CustomBookingInformationRepository {

    public Flux<BookingInformation> findByLookUp();
}
