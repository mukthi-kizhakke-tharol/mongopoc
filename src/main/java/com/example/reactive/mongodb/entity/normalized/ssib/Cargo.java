package com.example.reactive.mongodb.entity.normalized.ssib;

import java.util.List;

public class Cargo {

    private String maerskCommodityCode;

    private String cargoType;

    private Integer cargoWeight;

    private String weightMeasurementUnit;

    private String cargoVolume;

    private String volumeMeasurementUnit;

    private List<DangerousDocument> dangerousGoodsDocuments;

    private String instanceId;

    private String action;

    public Cargo() {
    }

    public Cargo(String maerskCommodityCode, String cargoType, Integer cargoWeight, String weightMeasurementUnit, String cargoVolume, String volumeMeasurementUnit, List<DangerousDocument> dangerousGoodsDocuments, String instanceId, String action) {
        this.maerskCommodityCode = maerskCommodityCode;
        this.cargoType = cargoType;
        this.cargoWeight = cargoWeight;
        this.weightMeasurementUnit = weightMeasurementUnit;
        this.cargoVolume = cargoVolume;
        this.volumeMeasurementUnit = volumeMeasurementUnit;
        this.dangerousGoodsDocuments = dangerousGoodsDocuments;
        this.instanceId = instanceId;
        this.action = action;
    }

    public String getMaerskCommodityCode() {
        return maerskCommodityCode;
    }

    public void setMaerskCommodityCode(String maerskCommodityCode) {
        this.maerskCommodityCode = maerskCommodityCode;
    }

    public String getCargoType() {
        return cargoType;
    }

    public void setCargoType(String cargoType) {
        this.cargoType = cargoType;
    }

    public Integer getCargoWeight() {
        return cargoWeight;
    }

    public void setCargoWeight(Integer cargoWeight) {
        this.cargoWeight = cargoWeight;
    }

    public String getWeightMeasurementUnit() {
        return weightMeasurementUnit;
    }

    public void setWeightMeasurementUnit(String weightMeasurementUnit) {
        this.weightMeasurementUnit = weightMeasurementUnit;
    }

    public String getCargoVolume() {
        return cargoVolume;
    }

    public void setCargoVolume(String cargoVolume) {
        this.cargoVolume = cargoVolume;
    }

    public String getVolumeMeasurementUnit() {
        return volumeMeasurementUnit;
    }

    public void setVolumeMeasurementUnit(String volumeMeasurementUnit) {
        this.volumeMeasurementUnit = volumeMeasurementUnit;
    }

    public List<DangerousDocument> getDangerousGoodsDocuments() {
        return dangerousGoodsDocuments;
    }

    public void setDangerousGoodsDocuments(List<DangerousDocument> dangerousGoodsDocuments) {
        this.dangerousGoodsDocuments = dangerousGoodsDocuments;
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
