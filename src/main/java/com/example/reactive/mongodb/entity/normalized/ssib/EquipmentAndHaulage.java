package com.example.reactive.mongodb.entity.normalized.ssib;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EquipmentAndHaulage {

    public static final String WEIGHT = "WEIGHT";
    private Container containerDetails;

    private List<Stuffing> stuffing;

    private List<DangerousDetails> dangerousDetails;

    private List<Haulage> haulage;

    private String instanceId;

    private String stuffingAction;

    private String stuffingInstanceId;

    private Integer groupId;

    public EquipmentAndHaulage() {
    }

    public EquipmentAndHaulage(Container containerDetails, List<Stuffing> stuffing, List<DangerousDetails> dangerousDetails, List<Haulage> haulage, String instanceId, String stuffingAction, String stuffingInstanceId, Integer groupId) {
        this.containerDetails = containerDetails;
        this.stuffing = stuffing;
        this.dangerousDetails = dangerousDetails;
        this.haulage = haulage;
        this.instanceId = instanceId;
        this.stuffingAction = stuffingAction;
        this.stuffingInstanceId = stuffingInstanceId;
        this.groupId = groupId;
    }

    public Container getContainerDetails() {
        return containerDetails;
    }

    public void setContainerDetails(Container containerDetails) {
        this.containerDetails = containerDetails;
    }

    public List<Stuffing> getStuffing() {
        return stuffing;
    }

    public void setStuffing(List<Stuffing> stuffing) {
        this.stuffing = stuffing;
    }

    public List<DangerousDetails> getDangerousDetails() {
        return dangerousDetails;
    }

    public void setDangerousDetails(List<DangerousDetails> dangerousDetails) {
        this.dangerousDetails = dangerousDetails;
    }

    public List<Haulage> getHaulage() {
        return haulage;
    }

    public void setHaulage(List<Haulage> haulage) {
        this.haulage = haulage;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public String getStuffingAction() {
        return stuffingAction;
    }

    public void setStuffingAction(String stuffingAction) {
        this.stuffingAction = stuffingAction;
    }

    public String getStuffingInstanceId() {
        return stuffingInstanceId;
    }

    public void setStuffingInstanceId(String stuffingInstanceId) {
        this.stuffingInstanceId = stuffingInstanceId;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }
}
