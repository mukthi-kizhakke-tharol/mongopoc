package com.example.reactive.mongodb.entity.normalized.ssib;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.time.LocalDate;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Transport {

    @JsonFormat(pattern = "yyyy-MM-dd", shape = JsonFormat.Shape.STRING)
    private LocalDate earliestDepartureDate;

    private String carrierCode;

    private String exportServiceMode;

    private String importServiceMode;

    private RouteDetails routeDetails;

    public Transport() {
    }

    public Transport(LocalDate earliestDepartureDate, String carrierCode, String exportServiceMode, String importServiceMode, RouteDetails routeDetails) {
        this.earliestDepartureDate = earliestDepartureDate;
        this.carrierCode = carrierCode;
        this.exportServiceMode = exportServiceMode;
        this.importServiceMode = importServiceMode;
        this.routeDetails = routeDetails;
    }

    public LocalDate getEarliestDepartureDate() {
        return earliestDepartureDate;
    }

    public void setEarliestDepartureDate(LocalDate earliestDepartureDate) {
        this.earliestDepartureDate = earliestDepartureDate;
    }

    public String getCarrierCode() {
        return carrierCode;
    }

    public void setCarrierCode(String carrierCode) {
        this.carrierCode = carrierCode;
    }

    public String getExportServiceMode() {
        return exportServiceMode;
    }

    public void setExportServiceMode(String exportServiceMode) {
        this.exportServiceMode = exportServiceMode;
    }

    public String getImportServiceMode() {
        return importServiceMode;
    }

    public void setImportServiceMode(String importServiceMode) {
        this.importServiceMode = importServiceMode;
    }

    public RouteDetails getRouteDetails() {
        return routeDetails;
    }

    public void setRouteDetails(RouteDetails routeDetails) {
        this.routeDetails = routeDetails;
    }
}
