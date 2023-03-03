package com.example.reactive.mongodb.entity.normalized.ssib;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DGClassificationType {

    
    private String presentationSequence;

    private String instanceIdValue;

    private String instanceId;

    private String action;

    private String classificationValue;

    public DGClassificationType() {
    }

    public DGClassificationType(String presentationSequence, String instanceIdValue, String instanceId, String action, String classificationValue) {
        this.presentationSequence = presentationSequence;
        this.instanceIdValue = instanceIdValue;
        this.instanceId = instanceId;
        this.action = action;
        this.classificationValue = classificationValue;
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

    public String getClassificationValue() {
        return classificationValue;
    }

    public void setClassificationValue(String classificationValue) {
        this.classificationValue = classificationValue;
    }
}
