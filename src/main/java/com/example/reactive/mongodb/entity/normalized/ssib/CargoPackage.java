package com.example.reactive.mongodb.entity.normalized.ssib;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CargoPackage {

    private String instanceId;
    private String presentationSequence;
    private String kind;
    private Integer packageCount;

    public CargoPackage() {
    }

    public CargoPackage(String instanceId, String presentationSequence, String kind, Integer packageCount) {
        this.instanceId = instanceId;
        this.presentationSequence = presentationSequence;
        this.kind = kind;
        this.packageCount = packageCount;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public String getPresentationSequence() {
        return presentationSequence;
    }

    public void setPresentationSequence(String presentationSequence) {
        this.presentationSequence = presentationSequence;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public Integer getPackageCount() {
        return packageCount;
    }

    public void setPackageCount(Integer packageCount) {
        this.packageCount = packageCount;
    }
}
