package com.example.reactive.mongodb.entity.normalized.dbRef;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class DBRefBook {

    @Id
    private Long id;
    private String title;
    private int pages;

    @DBRef
    private DBRefPublisher dbRefPublisher;

    public DBRefBook() {
    }

    public DBRefBook(Long id, String title, int pages, DBRefPublisher dbRefPublisher) {
        this.id = id;
        this.title = title;
        this.pages = pages;
        this.dbRefPublisher = dbRefPublisher;
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

    public DBRefPublisher getDbRefPublisher() {
        return dbRefPublisher;
    }

    public void setDbRefPublisher(DBRefPublisher dbRefPublisher) {
        this.dbRefPublisher = dbRefPublisher;
    }
}
