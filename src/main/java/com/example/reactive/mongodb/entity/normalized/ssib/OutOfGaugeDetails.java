package com.example.reactive.mongodb.entity.normalized.ssib;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class OutOfGaugeDetails {

    private String quoteReferenceNumber;

    private List<MeasurementUnit> cargoHeight;

    private List<MeasurementUnit> cargoLength;

    private List<MeasurementUnit> cargoWidth;

    private List<MeasurementUnit> cargoWeight;

    public OutOfGaugeDetails() {
    }

    public OutOfGaugeDetails(String quoteReferenceNumber, List<MeasurementUnit> cargoHeight, List<MeasurementUnit> cargoLength, List<MeasurementUnit> cargoWidth, List<MeasurementUnit> cargoWeight) {
        this.quoteReferenceNumber = quoteReferenceNumber;
        this.cargoHeight = cargoHeight;
        this.cargoLength = cargoLength;
        this.cargoWidth = cargoWidth;
        this.cargoWeight = cargoWeight;
    }

    public String getQuoteReferenceNumber() {
        return quoteReferenceNumber;
    }

    public void setQuoteReferenceNumber(String quoteReferenceNumber) {
        this.quoteReferenceNumber = quoteReferenceNumber;
    }

    public List<MeasurementUnit> getCargoHeight() {
        return cargoHeight;
    }

    public void setCargoHeight(List<MeasurementUnit> cargoHeight) {
        this.cargoHeight = cargoHeight;
    }

    public List<MeasurementUnit> getCargoLength() {
        return cargoLength;
    }

    public void setCargoLength(List<MeasurementUnit> cargoLength) {
        this.cargoLength = cargoLength;
    }

    public List<MeasurementUnit> getCargoWidth() {
        return cargoWidth;
    }

    public void setCargoWidth(List<MeasurementUnit> cargoWidth) {
        this.cargoWidth = cargoWidth;
    }

    public List<MeasurementUnit> getCargoWeight() {
        return cargoWeight;
    }

    public void setCargoWeight(List<MeasurementUnit> cargoWeight) {
        this.cargoWeight = cargoWeight;
    }
}
