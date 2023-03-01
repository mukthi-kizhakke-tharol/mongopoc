package com.example.reactive.mongodb.entity.normalized.ssib;

public class Container {

    private String isoCode;

    private String size;

    private String type;

    private String action;

    private String height;

    private Integer quantity;

    private String shipperEquipmentNumber;

    private Boolean isShipperOwned;

    private Boolean isImportReturned;

    private Boolean isOutOfGauge;

    private String instanceId;

    private OutOfGaugeDetails outOfGaugeDetails;

    public Container() {
    }

    public Container(String isoCode, String size, String type, String action, String height, Integer quantity, String shipperEquipmentNumber, Boolean isShipperOwned, Boolean isImportReturned, Boolean isOutOfGauge, String instanceId, OutOfGaugeDetails outOfGaugeDetails) {
        this.isoCode = isoCode;
        this.size = size;
        this.type = type;
        this.action = action;
        this.height = height;
        this.quantity = quantity;
        this.shipperEquipmentNumber = shipperEquipmentNumber;
        this.isShipperOwned = isShipperOwned;
        this.isImportReturned = isImportReturned;
        this.isOutOfGauge = isOutOfGauge;
        this.instanceId = instanceId;
        this.outOfGaugeDetails = outOfGaugeDetails;
    }

    public String getIsoCode() {
        return isoCode;
    }

    public void setIsoCode(String isoCode) {
        this.isoCode = isoCode;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getShipperEquipmentNumber() {
        return shipperEquipmentNumber;
    }

    public void setShipperEquipmentNumber(String shipperEquipmentNumber) {
        this.shipperEquipmentNumber = shipperEquipmentNumber;
    }

    public Boolean getShipperOwned() {
        return isShipperOwned;
    }

    public void setShipperOwned(Boolean shipperOwned) {
        isShipperOwned = shipperOwned;
    }

    public Boolean getImportReturned() {
        return isImportReturned;
    }

    public void setImportReturned(Boolean importReturned) {
        isImportReturned = importReturned;
    }

    public Boolean getOutOfGauge() {
        return isOutOfGauge;
    }

    public void setOutOfGauge(Boolean outOfGauge) {
        isOutOfGauge = outOfGauge;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public OutOfGaugeDetails getOutOfGaugeDetails() {
        return outOfGaugeDetails;
    }

    public void setOutOfGaugeDetails(OutOfGaugeDetails outOfGaugeDetails) {
        this.outOfGaugeDetails = outOfGaugeDetails;
    }
}
