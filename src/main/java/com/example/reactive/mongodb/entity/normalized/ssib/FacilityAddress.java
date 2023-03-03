package com.example.reactive.mongodb.entity.normalized.ssib;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FacilityAddress {

    @JsonProperty("maerskDepotOrTerminalGeoId")
    private String maerskDepotOrTerminalGeoId;

    @JsonProperty("cityName")
    private String cityName;

    @JsonProperty("streetAddress")
    private String streetAddress;

    @JsonProperty("ISOcountryCode")
    private String iSOcountryCode;

    public FacilityAddress() {
    }

    public FacilityAddress(String maerskDepotOrTerminalGeoId, String cityName, String streetAddress, String iSOcountryCode) {
        this.maerskDepotOrTerminalGeoId = maerskDepotOrTerminalGeoId;
        this.cityName = cityName;
        this.streetAddress = streetAddress;
        this.iSOcountryCode = iSOcountryCode;
    }

    public String getMaerskDepotOrTerminalGeoId() {
        return maerskDepotOrTerminalGeoId;
    }

    public void setMaerskDepotOrTerminalGeoId(String maerskDepotOrTerminalGeoId) {
        this.maerskDepotOrTerminalGeoId = maerskDepotOrTerminalGeoId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getiSOcountryCode() {
        return iSOcountryCode;
    }

    public void setiSOcountryCode(String iSOcountryCode) {
        this.iSOcountryCode = iSOcountryCode;
    }
}
