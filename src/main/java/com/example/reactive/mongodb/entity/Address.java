package com.example.reactive.mongodb.entity;

import org.springframework.data.annotation.Id;

public class Address {

    private Long id;
    private String street;
    private Telephone telephone;

    public Address() {
    }

    public Address(Long id, String street, Telephone telephone) {
        this.id = id;
        this.street = street;
        this.telephone = telephone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Telephone getTelephone() {
        return telephone;
    }

    public void setTelephone(Telephone telephone) {
        this.telephone = telephone;
    }
}
