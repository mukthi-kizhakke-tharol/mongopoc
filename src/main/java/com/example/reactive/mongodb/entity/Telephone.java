package com.example.reactive.mongodb.entity;

public class Telephone {

    private Long id;
    private String mobileNumber;
    private String landLineNumber;

    public Telephone() {
    }

    public Telephone(Long id, String mobileNumber, String landLineNumber) {
        this.id = id;
        this.mobileNumber = mobileNumber;
        this.landLineNumber = landLineNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getLandLineNumber() {
        return landLineNumber;
    }

    public void setLandLineNumber(String landLineNumber) {
        this.landLineNumber = landLineNumber;
    }
}
