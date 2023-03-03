package com.example.reactive.mongodb.entity.normalized.ssib;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Haulage {

    public static final String ACTION_N = "N";
    public static final String ACTION_D = "D";
    public static final String ACTION_I = "I";
    public static final String ACTION_U = "U";
    public static final String CARGO_PICKUP = "CARGO_PICKUP";

    private String instanceId;

    private String action;


    public enum HaulageArrangement {CARRIER, MERCHANT}

    public enum OperationalStage {EXPORT, IMPORT}

    private HaulageArrangement arrangementType;

    private OperationalStage operationalStage;
    private String haulageArrangeEquipmentInstanceId;

    private List<HaulageSite> haulageSites;

    private String instructions;

    public Haulage() {
    }

    public Haulage(String instanceId, String action, String haulageArrangeEquipmentInstanceId, HaulageArrangement arrangementType, OperationalStage operationalStage, List<HaulageSite> haulageSites, String instructions) {
        this.instanceId = instanceId;
        this.action = action;
        this.haulageArrangeEquipmentInstanceId = haulageArrangeEquipmentInstanceId;
        this.arrangementType = arrangementType;
        this.operationalStage = operationalStage;
        this.haulageSites = haulageSites;
        this.instructions = instructions;
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

    public String getHaulageArrangeEquipmentInstanceId() {
        return haulageArrangeEquipmentInstanceId;
    }

    public void setHaulageArrangeEquipmentInstanceId(String haulageArrangeEquipmentInstanceId) {
        this.haulageArrangeEquipmentInstanceId = haulageArrangeEquipmentInstanceId;
    }

    public HaulageArrangement getArrangementType() {
        return arrangementType;
    }

    public void setArrangementType(HaulageArrangement arrangementType) {
        this.arrangementType = arrangementType;
    }

    public OperationalStage getOperationalStage() {
        return operationalStage;
    }

    public void setOperationalStage(OperationalStage operationalStage) {
        this.operationalStage = operationalStage;
    }

    public List<HaulageSite> getHaulageSites() {
        return haulageSites;
    }

    public void setHaulageSites(List<HaulageSite> haulageSites) {
        this.haulageSites = haulageSites;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }
}
