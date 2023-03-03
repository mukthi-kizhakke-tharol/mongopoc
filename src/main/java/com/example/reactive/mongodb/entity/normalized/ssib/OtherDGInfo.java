package com.example.reactive.mongodb.entity.normalized.ssib;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class OtherDGInfo {

    private String properShippingName;

    private String technicalName;

    private String subRisk1;

    private String subRisk2;

    private String marinePollutant;

    private String emsRangeStart;

    private String emsRangeEnd;

    private List<MeasurementUnit> flashPointTemperature;

    private List<MeasurementUnit> catTemperature;

    private List<MeasurementUnit> sadtTemperature;

    private List<MeasurementUnit> controlTemperature;

    private List<MeasurementUnit> emergencyTemperature;

    private List<SegregationGroup> segregationGroup;

    private List<SegregationGroup> additionalSegregationGroup;

    private EmergencyContact emergencyContact;

    private Boolean isUSRegulated;

    private String suffix;

    public OtherDGInfo() {
    }

    public OtherDGInfo(String properShippingName, String technicalName, String subRisk1, String subRisk2, String marinePollutant, String emsRangeStart, String emsRangeEnd, List<MeasurementUnit> flashPointTemperature, List<MeasurementUnit> catTemperature, List<MeasurementUnit> sadtTemperature, List<MeasurementUnit> controlTemperature, List<MeasurementUnit> emergencyTemperature, List<SegregationGroup> segregationGroup, List<SegregationGroup> additionalSegregationGroup, EmergencyContact emergencyContact, Boolean isUSRegulated, String suffix) {
        this.properShippingName = properShippingName;
        this.technicalName = technicalName;
        this.subRisk1 = subRisk1;
        this.subRisk2 = subRisk2;
        this.marinePollutant = marinePollutant;
        this.emsRangeStart = emsRangeStart;
        this.emsRangeEnd = emsRangeEnd;
        this.flashPointTemperature = flashPointTemperature;
        this.catTemperature = catTemperature;
        this.sadtTemperature = sadtTemperature;
        this.controlTemperature = controlTemperature;
        this.emergencyTemperature = emergencyTemperature;
        this.segregationGroup = segregationGroup;
        this.additionalSegregationGroup = additionalSegregationGroup;
        this.emergencyContact = emergencyContact;
        this.isUSRegulated = isUSRegulated;
        this.suffix = suffix;
    }

    public String getProperShippingName() {
        return properShippingName;
    }

    public void setProperShippingName(String properShippingName) {
        this.properShippingName = properShippingName;
    }

    public String getTechnicalName() {
        return technicalName;
    }

    public void setTechnicalName(String technicalName) {
        this.technicalName = technicalName;
    }

    public String getSubRisk1() {
        return subRisk1;
    }

    public void setSubRisk1(String subRisk1) {
        this.subRisk1 = subRisk1;
    }

    public String getSubRisk2() {
        return subRisk2;
    }

    public void setSubRisk2(String subRisk2) {
        this.subRisk2 = subRisk2;
    }

    public String getMarinePollutant() {
        return marinePollutant;
    }

    public void setMarinePollutant(String marinePollutant) {
        this.marinePollutant = marinePollutant;
    }

    public String getEmsRangeStart() {
        return emsRangeStart;
    }

    public void setEmsRangeStart(String emsRangeStart) {
        this.emsRangeStart = emsRangeStart;
    }

    public String getEmsRangeEnd() {
        return emsRangeEnd;
    }

    public void setEmsRangeEnd(String emsRangeEnd) {
        this.emsRangeEnd = emsRangeEnd;
    }

    public List<MeasurementUnit> getFlashPointTemperature() {
        return flashPointTemperature;
    }

    public void setFlashPointTemperature(List<MeasurementUnit> flashPointTemperature) {
        this.flashPointTemperature = flashPointTemperature;
    }

    public List<MeasurementUnit> getCatTemperature() {
        return catTemperature;
    }

    public void setCatTemperature(List<MeasurementUnit> catTemperature) {
        this.catTemperature = catTemperature;
    }

    public List<MeasurementUnit> getSadtTemperature() {
        return sadtTemperature;
    }

    public void setSadtTemperature(List<MeasurementUnit> sadtTemperature) {
        this.sadtTemperature = sadtTemperature;
    }

    public List<MeasurementUnit> getControlTemperature() {
        return controlTemperature;
    }

    public void setControlTemperature(List<MeasurementUnit> controlTemperature) {
        this.controlTemperature = controlTemperature;
    }

    public List<MeasurementUnit> getEmergencyTemperature() {
        return emergencyTemperature;
    }

    public void setEmergencyTemperature(List<MeasurementUnit> emergencyTemperature) {
        this.emergencyTemperature = emergencyTemperature;
    }

    public List<SegregationGroup> getSegregationGroup() {
        return segregationGroup;
    }

    public void setSegregationGroup(List<SegregationGroup> segregationGroup) {
        this.segregationGroup = segregationGroup;
    }

    public List<SegregationGroup> getAdditionalSegregationGroup() {
        return additionalSegregationGroup;
    }

    public void setAdditionalSegregationGroup(List<SegregationGroup> additionalSegregationGroup) {
        this.additionalSegregationGroup = additionalSegregationGroup;
    }

    public EmergencyContact getEmergencyContact() {
        return emergencyContact;
    }

    public void setEmergencyContact(EmergencyContact emergencyContact) {
        this.emergencyContact = emergencyContact;
    }

    public Boolean getUSRegulated() {
        return isUSRegulated;
    }

    public void setUSRegulated(Boolean USRegulated) {
        isUSRegulated = USRegulated;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
}
