package com.example.reactive.mongodb.entity.normalized.ssib;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Stuffing {

    private String propertyType;

    private Double propertyValue;

    private String propertyMeasurementUnit;

    public Stuffing() {
    }

    public Stuffing(String propertyType, Double propertyValue, String propertyMeasurementUnit) {
        this.propertyType = propertyType;
        this.propertyValue = propertyValue;
        this.propertyMeasurementUnit = propertyMeasurementUnit;
    }

    public String getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }

    public Double getPropertyValue() {
        return propertyValue;
    }

    public void setPropertyValue(Double propertyValue) {
        this.propertyValue = propertyValue;
    }

    public String getPropertyMeasurementUnit() {
        return propertyMeasurementUnit;
    }

    public void setPropertyMeasurementUnit(String propertyMeasurementUnit) {
        this.propertyMeasurementUnit = propertyMeasurementUnit;
    }
}
