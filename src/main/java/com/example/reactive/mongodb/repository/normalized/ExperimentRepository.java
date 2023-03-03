package com.example.reactive.mongodb.repository.normalized;

import com.example.reactive.mongodb.entity.Experiment;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ExperimentRepository extends ReactiveMongoRepository<Experiment, String> {
}
