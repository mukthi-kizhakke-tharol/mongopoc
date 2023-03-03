package com.example.reactive.mongodb.entity.normalized.ssib;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Location {

    private String maerskCityGeoId;

    private String maerskCityCode;

    private String cityName;

    private String maerskSiteGeoId;

    private String maerskSiteCode;

    private String siteName;

    private String maerskCountryGeoId;

    private String countryCode;

    private String countryName;

    private String instanceId;

    private String action;

    public Location() {
    }

    public Location(String maerskCityGeoId, String maerskCityCode, String cityName, String maerskSiteGeoId, String maerskSiteCode, String siteName, String maerskCountryGeoId, String countryCode, String countryName, String instanceId, String action) {
        this.maerskCityGeoId = maerskCityGeoId;
        this.maerskCityCode = maerskCityCode;
        this.cityName = cityName;
        this.maerskSiteGeoId = maerskSiteGeoId;
        this.maerskSiteCode = maerskSiteCode;
        this.siteName = siteName;
        this.maerskCountryGeoId = maerskCountryGeoId;
        this.countryCode = countryCode;
        this.countryName = countryName;
        this.instanceId = instanceId;
        this.action = action;
    }

    public String getMaerskCityGeoId() {
        return maerskCityGeoId;
    }

    public void setMaerskCityGeoId(String maerskCityGeoId) {
        this.maerskCityGeoId = maerskCityGeoId;
    }

    public String getMaerskCityCode() {
        return maerskCityCode;
    }

    public void setMaerskCityCode(String maerskCityCode) {
        this.maerskCityCode = maerskCityCode;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getMaerskSiteGeoId() {
        return maerskSiteGeoId;
    }

    public void setMaerskSiteGeoId(String maerskSiteGeoId) {
        this.maerskSiteGeoId = maerskSiteGeoId;
    }

    public String getMaerskSiteCode() {
        return maerskSiteCode;
    }

    public void setMaerskSiteCode(String maerskSiteCode) {
        this.maerskSiteCode = maerskSiteCode;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public String getMaerskCountryGeoId() {
        return maerskCountryGeoId;
    }

    public void setMaerskCountryGeoId(String maerskCountryGeoId) {
        this.maerskCountryGeoId = maerskCountryGeoId;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}
