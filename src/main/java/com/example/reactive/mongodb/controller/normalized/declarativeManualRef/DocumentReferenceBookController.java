package com.example.reactive.mongodb.controller.normalized.declarativeManualRef;

import com.example.reactive.mongodb.entity.normalized.dbRef.DBRefBook;
import com.example.reactive.mongodb.entity.normalized.declarativeManualRef.DocumentReferenceBook;
import com.example.reactive.mongodb.repository.normalized.dbRef.DBRefBookRepository;
import com.example.reactive.mongodb.repository.normalized.declarativeManualRef.DocumentReferenceBookRepository;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value = "/api/documentReference/book")
public class DocumentReferenceBookController {

    private DocumentReferenceBookRepository documentReferenceBookRepository;

    public DocumentReferenceBookController(DocumentReferenceBookRepository documentReferenceBookRepository) {
        this.documentReferenceBookRepository = documentReferenceBookRepository;
    }

    @PostMapping
    public Mono<DocumentReferenceBook> createDBRefBook(@RequestBody DocumentReferenceBook documentReferenceBook) {
        return documentReferenceBookRepository.save(documentReferenceBook);
    }

    @GetMapping
    public Flux<DocumentReferenceBook> findAll() {
        return documentReferenceBookRepository.findAll();
    }
}
