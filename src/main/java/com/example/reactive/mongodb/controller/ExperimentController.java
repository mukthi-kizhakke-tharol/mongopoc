package com.example.reactive.mongodb.controller;

import com.example.reactive.mongodb.entity.Experiment;
import com.example.reactive.mongodb.repository.normalized.ExperimentRepository;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value = "/api/experiment")
public class ExperimentController {

    private final ExperimentRepository experimentRepository;

    public ExperimentController(ExperimentRepository experimentRepository) {
        this.experimentRepository = experimentRepository;
    }

    @PostMapping
    public Mono<Experiment> save(@RequestBody Experiment experiment) {
        return this.experimentRepository.save(experiment);
    }

    @GetMapping(value="/{id}")
    public Mono<Experiment> findById(@PathVariable String id) {
        return this.experimentRepository.findById(id);
    }
}
