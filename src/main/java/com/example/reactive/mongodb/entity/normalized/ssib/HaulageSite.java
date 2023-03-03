package com.example.reactive.mongodb.entity.normalized.ssib;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.time.LocalDateTime;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class HaulageSite {

    public static final String EMPTY_EQUIPMENT_PICKUP = "EMPTY_EQUIPMENT_PICKUP";
    public static final String FULL_RETURN = "FULL_RETURN";
    public static final String CARGO_PICKUP = "CARGO_PICKUP";

    private String haulageSiteInstanceId;
    private String haulageSiteSequence;
    private String action;

    private String maerskHaulageSiteRole;

    private String maerskSiteReferenceId;


    private String siteGeoId;

    private String siteCode;

    private String siteName;

    private String cityGeoId;

    private String cityCode;

    private String cityName;



    private String haulageReference;

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss", shape = JsonFormat.Shape.STRING)
    private LocalDateTime haulageEndTimestampLocal;

    private ContactPerson haulageContact;



    private String haulageEquipmentInstanceId;

    private String haulageEquipmentSequence;

    private String haulageSiteReferenceInstanceId;

    private String haulageSiteReferenceValueInstanceId;

    private String haulageReferencePresentationSequence;

    private String haulageReferenceAction;

    private String haulageArrangeEquipmentInstanceId;

    private String tradingName;

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss", shape = JsonFormat.Shape.STRING)
    private LocalDateTime haulageStartTimestampLocal;
    private String siteAddress;

    private String address1;

    private String address2;

    private String address3;

    private String city;

    private String stateName;

    private String countryName;

    private String street;

    private String postalCode;

    private String facilityCode;

    private FacilityAddress facilityAddress;

    private String customerCode;

    public HaulageSite() {
    }

    public HaulageSite(String action, String maerskHaulageSiteRole, String maerskSiteReferenceId, String siteAddress, String siteGeoId, String siteCode, String siteName, String cityGeoId, String cityCode, String cityName, LocalDateTime haulageStartTimestampLocal, String haulageReference, LocalDateTime haulageEndTimestampLocal, ContactPerson haulageContact, String haulageSiteInstanceId, String haulageSiteSequence, String haulageEquipmentInstanceId, String haulageEquipmentSequence, String haulageSiteReferenceInstanceId, String haulageSiteReferenceValueInstanceId, String haulageReferencePresentationSequence, String haulageReferenceAction, String haulageArrangeEquipmentInstanceId, String tradingName, String address1, String address2, String address3, String city, String stateName, String countryName, String street, String postalCode, String facilityCode, FacilityAddress facilityAddress, String customerCode) {
        this.action = action;
        this.maerskHaulageSiteRole = maerskHaulageSiteRole;
        this.maerskSiteReferenceId = maerskSiteReferenceId;
        this.siteAddress = siteAddress;
        this.siteGeoId = siteGeoId;
        this.siteCode = siteCode;
        this.siteName = siteName;
        this.cityGeoId = cityGeoId;
        this.cityCode = cityCode;
        this.cityName = cityName;
        this.haulageStartTimestampLocal = haulageStartTimestampLocal;
        this.haulageReference = haulageReference;
        this.haulageEndTimestampLocal = haulageEndTimestampLocal;
        this.haulageContact = haulageContact;
        this.haulageSiteInstanceId = haulageSiteInstanceId;
        this.haulageSiteSequence = haulageSiteSequence;
        this.haulageEquipmentInstanceId = haulageEquipmentInstanceId;
        this.haulageEquipmentSequence = haulageEquipmentSequence;
        this.haulageSiteReferenceInstanceId = haulageSiteReferenceInstanceId;
        this.haulageSiteReferenceValueInstanceId = haulageSiteReferenceValueInstanceId;
        this.haulageReferencePresentationSequence = haulageReferencePresentationSequence;
        this.haulageReferenceAction = haulageReferenceAction;
        this.haulageArrangeEquipmentInstanceId = haulageArrangeEquipmentInstanceId;
        this.tradingName = tradingName;
        this.address1 = address1;
        this.address2 = address2;
        this.address3 = address3;
        this.city = city;
        this.stateName = stateName;
        this.countryName = countryName;
        this.street = street;
        this.postalCode = postalCode;
        this.facilityCode = facilityCode;
        this.facilityAddress = facilityAddress;
        this.customerCode = customerCode;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getMaerskHaulageSiteRole() {
        return maerskHaulageSiteRole;
    }

    public void setMaerskHaulageSiteRole(String maerskHaulageSiteRole) {
        this.maerskHaulageSiteRole = maerskHaulageSiteRole;
    }

    public String getMaerskSiteReferenceId() {
        return maerskSiteReferenceId;
    }

    public void setMaerskSiteReferenceId(String maerskSiteReferenceId) {
        this.maerskSiteReferenceId = maerskSiteReferenceId;
    }

    public String getSiteAddress() {
        return siteAddress;
    }

    public void setSiteAddress(String siteAddress) {
        this.siteAddress = siteAddress;
    }

    public String getSiteGeoId() {
        return siteGeoId;
    }

    public void setSiteGeoId(String siteGeoId) {
        this.siteGeoId = siteGeoId;
    }

    public String getSiteCode() {
        return siteCode;
    }

    public void setSiteCode(String siteCode) {
        this.siteCode = siteCode;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public String getCityGeoId() {
        return cityGeoId;
    }

    public void setCityGeoId(String cityGeoId) {
        this.cityGeoId = cityGeoId;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public LocalDateTime getHaulageStartTimestampLocal() {
        return haulageStartTimestampLocal;
    }

    public void setHaulageStartTimestampLocal(LocalDateTime haulageStartTimestampLocal) {
        this.haulageStartTimestampLocal = haulageStartTimestampLocal;
    }

    public String getHaulageReference() {
        return haulageReference;
    }

    public void setHaulageReference(String haulageReference) {
        this.haulageReference = haulageReference;
    }

    public LocalDateTime getHaulageEndTimestampLocal() {
        return haulageEndTimestampLocal;
    }

    public void setHaulageEndTimestampLocal(LocalDateTime haulageEndTimestampLocal) {
        this.haulageEndTimestampLocal = haulageEndTimestampLocal;
    }

    public ContactPerson getHaulageContact() {
        return haulageContact;
    }

    public void setHaulageContact(ContactPerson haulageContact) {
        this.haulageContact = haulageContact;
    }

    public String getHaulageSiteInstanceId() {
        return haulageSiteInstanceId;
    }

    public void setHaulageSiteInstanceId(String haulageSiteInstanceId) {
        this.haulageSiteInstanceId = haulageSiteInstanceId;
    }

    public String getHaulageSiteSequence() {
        return haulageSiteSequence;
    }

    public void setHaulageSiteSequence(String haulageSiteSequence) {
        this.haulageSiteSequence = haulageSiteSequence;
    }

    public String getHaulageEquipmentInstanceId() {
        return haulageEquipmentInstanceId;
    }

    public void setHaulageEquipmentInstanceId(String haulageEquipmentInstanceId) {
        this.haulageEquipmentInstanceId = haulageEquipmentInstanceId;
    }

    public String getHaulageEquipmentSequence() {
        return haulageEquipmentSequence;
    }

    public void setHaulageEquipmentSequence(String haulageEquipmentSequence) {
        this.haulageEquipmentSequence = haulageEquipmentSequence;
    }

    public String getHaulageSiteReferenceInstanceId() {
        return haulageSiteReferenceInstanceId;
    }

    public void setHaulageSiteReferenceInstanceId(String haulageSiteReferenceInstanceId) {
        this.haulageSiteReferenceInstanceId = haulageSiteReferenceInstanceId;
    }

    public String getHaulageSiteReferenceValueInstanceId() {
        return haulageSiteReferenceValueInstanceId;
    }

    public void setHaulageSiteReferenceValueInstanceId(String haulageSiteReferenceValueInstanceId) {
        this.haulageSiteReferenceValueInstanceId = haulageSiteReferenceValueInstanceId;
    }

    public String getHaulageReferencePresentationSequence() {
        return haulageReferencePresentationSequence;
    }

    public void setHaulageReferencePresentationSequence(String haulageReferencePresentationSequence) {
        this.haulageReferencePresentationSequence = haulageReferencePresentationSequence;
    }

    public String getHaulageReferenceAction() {
        return haulageReferenceAction;
    }

    public void setHaulageReferenceAction(String haulageReferenceAction) {
        this.haulageReferenceAction = haulageReferenceAction;
    }

    public String getHaulageArrangeEquipmentInstanceId() {
        return haulageArrangeEquipmentInstanceId;
    }

    public void setHaulageArrangeEquipmentInstanceId(String haulageArrangeEquipmentInstanceId) {
        this.haulageArrangeEquipmentInstanceId = haulageArrangeEquipmentInstanceId;
    }

    public String getTradingName() {
        return tradingName;
    }

    public void setTradingName(String tradingName) {
        this.tradingName = tradingName;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getAddress3() {
        return address3;
    }

    public void setAddress3(String address3) {
        this.address3 = address3;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getFacilityCode() {
        return facilityCode;
    }

    public void setFacilityCode(String facilityCode) {
        this.facilityCode = facilityCode;
    }

    public FacilityAddress getFacilityAddress() {
        return facilityAddress;
    }

    public void setFacilityAddress(FacilityAddress facilityAddress) {
        this.facilityAddress = facilityAddress;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }
}
