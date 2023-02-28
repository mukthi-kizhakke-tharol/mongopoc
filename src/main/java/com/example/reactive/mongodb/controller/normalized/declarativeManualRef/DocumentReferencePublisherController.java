package com.example.reactive.mongodb.controller.normalized.declarativeManualRef;

import com.example.reactive.mongodb.entity.normalized.declarativeManualRef.DocumentReferenceBook;
import com.example.reactive.mongodb.entity.normalized.declarativeManualRef.DocumentReferencePublisher;
import com.example.reactive.mongodb.repository.normalized.declarativeManualRef.DocumentReferencePublisherRepository;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value = "/api/documentReference/publisher")
public class DocumentReferencePublisherController {

    private DocumentReferencePublisherRepository documentReferencePublisherRepository;

    public DocumentReferencePublisherController(DocumentReferencePublisherRepository documentReferencePublisherRepository) {
        this.documentReferencePublisherRepository = documentReferencePublisherRepository;
    }

    @PostMapping
    public Mono<DocumentReferencePublisher> createDBRefBook(@RequestBody DocumentReferencePublisher documentReferencePublisher) {
        return documentReferencePublisherRepository.save(documentReferencePublisher);
    }

    @GetMapping
    public Flux<DocumentReferencePublisher> findAll() {
        return documentReferencePublisherRepository.findAll();
    }
}
