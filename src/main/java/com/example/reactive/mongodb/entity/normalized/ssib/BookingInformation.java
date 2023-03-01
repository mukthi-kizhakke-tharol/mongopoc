package com.example.reactive.mongodb.entity.normalized.ssib;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document
public class BookingInformation {

    @Id
    private String correlationId;

    private List<Party> parties;

    private Cargo cargo;

    private List<EquipmentAndHaulage> equipmentAndHaulage;

    private List<Long> equipmentAndHaulageIds = new ArrayList<>();

    public BookingInformation() {
    }

    public BookingInformation(String correlationId, List<Party> parties, Cargo cargo, List<EquipmentAndHaulage> equipmentAndHaulage, List<Long> equipmentAndHaulageIds) {
        this.correlationId = correlationId;
        this.parties = parties;
        this.cargo = cargo;
        this.equipmentAndHaulage = null;
        this.equipmentAndHaulageIds = new ArrayList<>();
    }

    public String getCorrelationId() {
        return correlationId;
    }

    public void setCorrelationId(String correlationId) {
        this.correlationId = correlationId;
    }

    public List<Party> getParties() {
        return parties;
    }

    public void setParties(List<Party> parties) {
        this.parties = parties;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public List<EquipmentAndHaulage> getEquipmentAndHaulage() {
        return equipmentAndHaulage;
    }

    public void setEquipmentAndHaulage(List<EquipmentAndHaulage> equipmentAndHaulage) {
        this.equipmentAndHaulage = equipmentAndHaulage;
    }

    public List<Long> getEquipmentAndHaulageIds() {
        return equipmentAndHaulageIds;
    }

    public void setEquipmentAndHaulageIds(List<Long> equipmentAndHaulageIds) {
        this.equipmentAndHaulageIds = equipmentAndHaulageIds;
    }
}
