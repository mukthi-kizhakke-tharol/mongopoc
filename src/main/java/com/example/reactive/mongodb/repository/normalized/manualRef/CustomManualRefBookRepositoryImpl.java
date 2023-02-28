package com.example.reactive.mongodb.repository.normalized.manualRef;

import com.example.reactive.mongodb.entity.normalized.manualRef.ManualRefBookResult;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.LookupOperation;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@Repository
public class CustomManualRefBookRepositoryImpl implements CustomManualRefBookRepository{

    private final ReactiveMongoTemplate reactiveMongoTemplate;

    public CustomManualRefBookRepositoryImpl(ReactiveMongoTemplate reactiveMongoTemplate) {
        this.reactiveMongoTemplate = reactiveMongoTemplate;
    }

    @Override
    public Flux<ManualRefBookResult> findByLookUp() {
        LookupOperation lookupOperation = LookupOperation.newLookup()
                .from("manualRefPublisher")
                .localField("manualRefPublisherId")
                .foreignField("_id")
                .as("manualRefPublisher");
        Aggregation aggregation = Aggregation.newAggregation(lookupOperation);
        Flux<ManualRefBookResult> results = reactiveMongoTemplate.aggregate(aggregation, "manualRefBook", ManualRefBookResult.class);
        return results;
    }
}
