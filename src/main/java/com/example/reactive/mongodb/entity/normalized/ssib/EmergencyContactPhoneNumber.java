package com.example.reactive.mongodb.entity.normalized.ssib;

public class EmergencyContactPhoneNumber {

    private String countryCallingCode;

    private String phoneNumber;

    public EmergencyContactPhoneNumber() {
    }

    public EmergencyContactPhoneNumber(String countryCallingCode, String phoneNumber) {
        this.countryCallingCode = countryCallingCode;
        this.phoneNumber = phoneNumber;
    }

    public String getCountryCallingCode() {
        return countryCallingCode;
    }

    public void setCountryCallingCode(String countryCallingCode) {
        this.countryCallingCode = countryCallingCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
