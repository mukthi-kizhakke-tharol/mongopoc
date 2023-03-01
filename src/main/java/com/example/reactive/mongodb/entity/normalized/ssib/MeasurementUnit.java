package com.example.reactive.mongodb.entity.normalized.ssib;

public class MeasurementUnit {

    private String value;

    private String unit;

    public MeasurementUnit() {
    }

    public MeasurementUnit(String value, String unit) {
        this.value = value;
        this.unit = unit;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}
