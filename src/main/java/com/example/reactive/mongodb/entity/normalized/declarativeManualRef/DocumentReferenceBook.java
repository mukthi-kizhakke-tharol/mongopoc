package com.example.reactive.mongodb.entity.normalized.declarativeManualRef;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
public class DocumentReferenceBook {

    @Id
    private Long id;
    private String title;
    private int pages;

    @DocumentReference
    private DocumentReferencePublisher documentReferencePublisher;

    public DocumentReferenceBook() {
    }

    public DocumentReferenceBook(Long id, String title, int pages, DocumentReferencePublisher documentReferencePublisher) {
        this.id = id;
        this.title = title;
        this.pages = pages;
        this.documentReferencePublisher = documentReferencePublisher;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public DocumentReferencePublisher getDocumentReferencePublisher() {
        return documentReferencePublisher;
    }

    public void setDocumentReferencePublisher(DocumentReferencePublisher documentReferencePublisher) {
        this.documentReferencePublisher = documentReferencePublisher;
    }
}
