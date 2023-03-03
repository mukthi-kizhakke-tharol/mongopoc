package com.example.reactive.mongodb.entity.normalized.ssib;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TransportMode {

    private Vessel vessel;

    private String exportVoyageNumber;

    private String importVoyageNumber;

    public TransportMode() {
    }

    public TransportMode(Vessel vessel, String exportVoyageNumber, String importVoyageNumber) {
        this.vessel = vessel;
        this.exportVoyageNumber = exportVoyageNumber;
        this.importVoyageNumber = importVoyageNumber;
    }

    public Vessel getVessel() {
        return vessel;
    }

    public void setVessel(Vessel vessel) {
        this.vessel = vessel;
    }

    public String getExportVoyageNumber() {
        return exportVoyageNumber;
    }

    public void setExportVoyageNumber(String exportVoyageNumber) {
        this.exportVoyageNumber = exportVoyageNumber;
    }

    public String getImportVoyageNumber() {
        return importVoyageNumber;
    }

    public void setImportVoyageNumber(String importVoyageNumber) {
        this.importVoyageNumber = importVoyageNumber;
    }
}
