package com.example.reactive.mongodb.entity.normalized.ssib;

import java.util.List;

public class WeightsAndMeasures {

    private List<MeasurementUnit> grossWeight;

    private List<MeasurementUnit> netWeight;

    private List<MeasurementUnit> netExplosiveContentWeight;

    private List<MeasurementUnit> volume;

    public WeightsAndMeasures() {
    }

    public WeightsAndMeasures(List<MeasurementUnit> grossWeight, List<MeasurementUnit> netWeight, List<MeasurementUnit> netExplosiveContentWeight, List<MeasurementUnit> volume) {
        this.grossWeight = grossWeight;
        this.netWeight = netWeight;
        this.netExplosiveContentWeight = netExplosiveContentWeight;
        this.volume = volume;
    }

    public List<MeasurementUnit> getGrossWeight() {
        return grossWeight;
    }

    public void setGrossWeight(List<MeasurementUnit> grossWeight) {
        this.grossWeight = grossWeight;
    }

    public List<MeasurementUnit> getNetWeight() {
        return netWeight;
    }

    public void setNetWeight(List<MeasurementUnit> netWeight) {
        this.netWeight = netWeight;
    }

    public List<MeasurementUnit> getNetExplosiveContentWeight() {
        return netExplosiveContentWeight;
    }

    public void setNetExplosiveContentWeight(List<MeasurementUnit> netExplosiveContentWeight) {
        this.netExplosiveContentWeight = netExplosiveContentWeight;
    }

    public List<MeasurementUnit> getVolume() {
        return volume;
    }

    public void setVolume(List<MeasurementUnit> volume) {
        this.volume = volume;
    }
}
