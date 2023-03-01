package com.example.reactive.mongodb.entity.normalized.ssib;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
public class EquipmentAndHaulage {

    public static final String WEIGHT = "WEIGHT";
    private Long id;
    private Container containerDetails;

    private List<Stuffing> stuffing;

    private List<DangerousDetails> dangerousDetails;

    private List<Haulage> haulage;

    private String instanceId;

    private String stuffingAction;

    private String stuffingInstanceId;

    private int groupId;

    public EquipmentAndHaulage() {
    }

    public EquipmentAndHaulage(Container containerDetails, List<Stuffing> stuffing, List<DangerousDetails> dangerousDetails, List<Haulage> haulage, String instanceId, String stuffingAction, String stuffingInstanceId, int groupId, Long id) {
        this.containerDetails = containerDetails;
        this.stuffing = stuffing;
        this.dangerousDetails = dangerousDetails;
        this.haulage = haulage;
        this.instanceId = instanceId;
        this.stuffingAction = stuffingAction;
        this.stuffingInstanceId = stuffingInstanceId;
        this.groupId = groupId;
        this.id = id;
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

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
