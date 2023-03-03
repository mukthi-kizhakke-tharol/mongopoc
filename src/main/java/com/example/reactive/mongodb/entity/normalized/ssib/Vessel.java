package com.example.reactive.mongodb.entity.normalized.ssib;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Vessel {

    private String maerskId;

    private String name;

    private String flagCode;

    private String flagName;

    private String imoNumber;

    private String callSign;

    @JsonFormat(pattern = "yyyy-MM-dd", shape = JsonFormat.Shape.STRING)
    private LocalDate buildDate;

    public Vessel() {
    }

    public Vessel(String maerskId, String name, String flagCode, String flagName, String imoNumber, String callSign, LocalDate buildDate) {
        this.maerskId = maerskId;
        this.name = name;
        this.flagCode = flagCode;
        this.flagName = flagName;
        this.imoNumber = imoNumber;
        this.callSign = callSign;
        this.buildDate = buildDate;
    }

    public String getMaerskId() {
        return maerskId;
    }

    public void setMaerskId(String maerskId) {
        this.maerskId = maerskId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFlagCode() {
        return flagCode;
    }

    public void setFlagCode(String flagCode) {
        this.flagCode = flagCode;
    }

    public String getFlagName() {
        return flagName;
    }

    public void setFlagName(String flagName) {
        this.flagName = flagName;
    }

    public String getImoNumber() {
        return imoNumber;
    }

    public void setImoNumber(String imoNumber) {
        this.imoNumber = imoNumber;
    }

    public String getCallSign() {
        return callSign;
    }

    public void setCallSign(String callSign) {
        this.callSign = callSign;
    }

    public LocalDate getBuildDate() {
        return buildDate;
    }

    public void setBuildDate(LocalDate buildDate) {
        this.buildDate = buildDate;
    }
}
