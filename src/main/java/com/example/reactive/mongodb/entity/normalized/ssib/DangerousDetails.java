package com.example.reactive.mongodb.entity.normalized.ssib;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DangerousDetails {

    private String imdgAmendment;

    private DGClassificationType imoClass;

    private DGClassificationType unNumber;

    private DGClassificationType naNumber;

    private PackagingDetails packagingDetails;

    private WeightsAndMeasures weightsAndMeasures;

    private OtherDGInfo otherInformation;

    private String presentationSequence;

    private String instanceIdValue;

    private String instanceId;

    private String action;

    private String fumigationName;

    public DangerousDetails() {
    }

    public DangerousDetails(String imdgAmendment, DGClassificationType imoClass, DGClassificationType unNumber, DGClassificationType naNumber, PackagingDetails packagingDetails, WeightsAndMeasures weightsAndMeasures, OtherDGInfo otherInformation, String presentationSequence, String instanceIdValue, String instanceId, String action, String fumigationName) {
        this.imdgAmendment = imdgAmendment;
        this.imoClass = imoClass;
        this.unNumber = unNumber;
        this.naNumber = naNumber;
        this.packagingDetails = packagingDetails;
        this.weightsAndMeasures = weightsAndMeasures;
        this.otherInformation = otherInformation;
        this.presentationSequence = presentationSequence;
        this.instanceIdValue = instanceIdValue;
        this.instanceId = instanceId;
        this.action = action;
        this.fumigationName = fumigationName;
    }

    public String getImdgAmendment() {
        return imdgAmendment;
    }

    public void setImdgAmendment(String imdgAmendment) {
        this.imdgAmendment = imdgAmendment;
    }

    public DGClassificationType getImoClass() {
        return imoClass;
    }

    public void setImoClass(DGClassificationType imoClass) {
        this.imoClass = imoClass;
    }

    public DGClassificationType getUnNumber() {
        return unNumber;
    }

    public void setUnNumber(DGClassificationType unNumber) {
        this.unNumber = unNumber;
    }

    public DGClassificationType getNaNumber() {
        return naNumber;
    }

    public void setNaNumber(DGClassificationType naNumber) {
        this.naNumber = naNumber;
    }

    public PackagingDetails getPackagingDetails() {
        return packagingDetails;
    }

    public void setPackagingDetails(PackagingDetails packagingDetails) {
        this.packagingDetails = packagingDetails;
    }

    public WeightsAndMeasures getWeightsAndMeasures() {
        return weightsAndMeasures;
    }

    public void setWeightsAndMeasures(WeightsAndMeasures weightsAndMeasures) {
        this.weightsAndMeasures = weightsAndMeasures;
    }

    public OtherDGInfo getOtherInformation() {
        return otherInformation;
    }

    public void setOtherInformation(OtherDGInfo otherInformation) {
        this.otherInformation = otherInformation;
    }

    public String getPresentationSequence() {
        return presentationSequence;
    }

    public void setPresentationSequence(String presentationSequence) {
        this.presentationSequence = presentationSequence;
    }

    public String getInstanceIdValue() {
        return instanceIdValue;
    }

    public void setInstanceIdValue(String instanceIdValue) {
        this.instanceIdValue = instanceIdValue;
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

    public String getFumigationName() {
        return fumigationName;
    }

    public void setFumigationName(String fumigationName) {
        this.fumigationName = fumigationName;
    }
}
