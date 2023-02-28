package com.example.reactive.mongodb.entity.normalized.declarativeManualRef;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.ReadOnlyProperty;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document
public class DocumentReferencePublisher {

    @Id
    private Long id;
    private String name;

    @DocumentReference
    private List<DocumentReferenceBook> documentReferenceBook;

    public DocumentReferencePublisher() {
    }

    public DocumentReferencePublisher(Long id, String name, List<DocumentReferenceBook> documentReferenceBook) {
        this.id = id;
        this.name = name;
        this.documentReferenceBook = documentReferenceBook;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<DocumentReferenceBook> getDocumentReferenceBook() {
        return documentReferenceBook;
    }

    public void setDocumentReferenceBook(List<DocumentReferenceBook> documentReferenceBook) {
        this.documentReferenceBook = documentReferenceBook;
    }
}
