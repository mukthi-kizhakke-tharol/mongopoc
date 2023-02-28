package com.example.reactive.mongodb.entity.normalized.manualRef;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class ManualRefBook {

    @Id
    private Long id;
    private String title;
    private int pages;
    @Indexed
    private Long manualRefPublisherId;

    public ManualRefBook() {
    }

    public ManualRefBook(Long id, String title, int pages, Long manualRefPublisherId) {
        this.id = id;
        this.title = title;
        this.pages = pages;
        this.manualRefPublisherId = manualRefPublisherId;
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

    public Long getManualRefPublisherId() {
        return manualRefPublisherId;
    }

    public void setManualRefPublisherId(Long manualRefPublisherId) {
        this.manualRefPublisherId = manualRefPublisherId;
    }
}
