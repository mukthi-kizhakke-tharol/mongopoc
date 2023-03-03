package com.example.reactive.mongodb.entity.normalized.ssib;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EmergencyContact {

    private String contactName;

    private EmergencyContactPhoneNumber contactPhoneNumber;

    private String presentationSequence;

    private String instanceId;

    public EmergencyContact() {
    }

    public EmergencyContact(String contactName, EmergencyContactPhoneNumber contactPhoneNumber, String presentationSequence, String instanceId) {
        this.contactName = contactName;
        this.contactPhoneNumber = contactPhoneNumber;
        this.presentationSequence = presentationSequence;
        this.instanceId = instanceId;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public EmergencyContactPhoneNumber getContactPhoneNumber() {
        return contactPhoneNumber;
    }

    public void setContactPhoneNumber(EmergencyContactPhoneNumber contactPhoneNumber) {
        this.contactPhoneNumber = contactPhoneNumber;
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
}
