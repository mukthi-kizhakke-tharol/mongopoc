package com.example.reactive.mongodb.repository.normalized.ssib;

import com.example.reactive.mongodb.entity.normalized.manualRef.ManualRefBookResult;
import com.example.reactive.mongodb.entity.normalized.ssib.BookingInformation;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.LookupOperation;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class CustomBookingInformationRepositoryImpl implements CustomBookingInformationRepository {

    private final ReactiveMongoTemplate reactiveMongoTemplate;

    public CustomBookingInformationRepositoryImpl(ReactiveMongoTemplate reactiveMongoTemplate) {
        this.reactiveMongoTemplate = reactiveMongoTemplate;
    }

    @Override
    public Flux<BookingInformation> findByLookUp() {
        LookupOperation lookupOperation = LookupOperation.newLookup()
                .from("equipmentAndHaulage")
                .localField("equipmentAndHaulageIds")
                .foreignField("_id")
                .as("equipmentAndHaulage");
        Aggregation aggregation = Aggregation.newAggregation(lookupOperation);
        Flux<BookingInformation> results = reactiveMongoTemplate.aggregate(aggregation, "bookingInformation", BookingInformation.class);
        return results;
    }
}
