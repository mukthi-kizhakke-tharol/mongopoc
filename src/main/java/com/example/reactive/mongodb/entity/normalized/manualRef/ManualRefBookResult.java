package com.example.reactive.mongodb.entity.normalized.manualRef;

import org.springframework.data.annotation.Id;

import java.util.List;

public class ManualRefBookResult {

    private Long id;
    private String title;
    private int pages;
    private List<ManualRefPublisher> manualRefPublisher;

    public ManualRefBookResult() {
    }

    public ManualRefBookResult(Long id, String title, int pages, List<ManualRefPublisher> manualRefPublisher) {
        this.id = id;
        this.title = title;
        this.pages = pages;
        this.manualRefPublisher = manualRefPublisher;
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

    public List<ManualRefPublisher> getManualRefPublisher() {
        return manualRefPublisher;
    }

    public void setManualRefPublisher(List<ManualRefPublisher> manualRefPublisher) {
        this.manualRefPublisher = manualRefPublisher;
    }
}
