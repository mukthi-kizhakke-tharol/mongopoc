package com.example.reactive.mongodb.entity.normalized.ssib;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.math.BigDecimal;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DGPackaging {

    private Integer quantity;

    private String packageType;

    private String isFinestLevel;

    private String packageStyle;

    private BigDecimal weight;

    private String packageCount;

    private String packageStyleKey;

    private String packageStyleCode;

    private String presentationSequence;

    private String instanceId;

    private String fkCargoPackageOuterPackage;

    public DGPackaging() {
    }

    public DGPackaging(Integer quantity, String packageType, String isFinestLevel, String packageStyle, BigDecimal weight, String packageCount, String packageStyleKey, String packageStyleCode, String presentationSequence, String instanceId, String fkCargoPackageOuterPackage) {
        this.quantity = quantity;
        this.packageType = packageType;
        this.isFinestLevel = isFinestLevel;
        this.packageStyle = packageStyle;
        this.weight = weight;
        this.packageCount = packageCount;
        this.packageStyleKey = packageStyleKey;
        this.packageStyleCode = packageStyleCode;
        this.presentationSequence = presentationSequence;
        this.instanceId = instanceId;
        this.fkCargoPackageOuterPackage = fkCargoPackageOuterPackage;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getPackageType() {
        return packageType;
    }

    public void setPackageType(String packageType) {
        this.packageType = packageType;
    }

    public String getIsFinestLevel() {
        return isFinestLevel;
    }

    public void setIsFinestLevel(String isFinestLevel) {
        this.isFinestLevel = isFinestLevel;
    }

    public String getPackageStyle() {
        return packageStyle;
    }

    public void setPackageStyle(String packageStyle) {
        this.packageStyle = packageStyle;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public String getPackageCount() {
        return packageCount;
    }

    public void setPackageCount(String packageCount) {
        this.packageCount = packageCount;
    }

    public String getPackageStyleKey() {
        return packageStyleKey;
    }

    public void setPackageStyleKey(String packageStyleKey) {
        this.packageStyleKey = packageStyleKey;
    }

    public String getPackageStyleCode() {
        return packageStyleCode;
    }

    public void setPackageStyleCode(String packageStyleCode) {
        this.packageStyleCode = packageStyleCode;
    }

    public String getPresentationSequence() {
        return presentationSequence;
    }

    public void setPresentationSequence(String presentationSequence) {
        this.presentationSequence = presentationSequence;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public String getFkCargoPackageOuterPackage() {
        return fkCargoPackageOuterPackage;
    }

    public void setFkCargoPackageOuterPackage(String fkCargoPackageOuterPackage) {
        this.fkCargoPackageOuterPackage = fkCargoPackageOuterPackage;
    }
}
