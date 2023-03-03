package com.example.reactive.mongodb.entity.normalized.ssib;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BookingInformation {

    @Id
    private String correlationId;

    private Cargo cargo;

    private References references;

    private Transport transport;

    private List<Party> parties;

    private List<EquipmentAndHaulage> equipmentAndHaulage;

    private CargoPackage cargoPackage;

    private List<ActivityTask> activityTasks;

    private ShipmentStatus shipmentStatus;

    private String businessUnit;

    private boolean isContainerGatedIn;

    private boolean isContainerPickedUp;

    private boolean isReefer;

    private boolean isTemperatureControlled;

    private boolean isDangerous;

    public BookingInformation() {
    }

    public BookingInformation(String correlationId, List<Party> parties, Cargo cargo, List<EquipmentAndHaulage> equipmentAndHaulage, References references, Transport transport, CargoPackage cargoPackage, List<ActivityTask> activityTasks, ShipmentStatus shipmentStatus, String businessUnit, boolean isContainerGatedIn, boolean isContainerPickedUp, boolean isReefer, boolean isTemperatureControlled, boolean isDangerous) {
        this.correlationId = correlationId;
        this.parties = parties;
        this.cargo = cargo;
        this.equipmentAndHaulage = equipmentAndHaulage;
        this.references = references;
        this.transport = transport;
        this.cargoPackage = cargoPackage;
        this.activityTasks = activityTasks;
        this.shipmentStatus = shipmentStatus;
        this.businessUnit = businessUnit;
        this.isContainerGatedIn = isContainerGatedIn;
        this.isContainerPickedUp = isContainerPickedUp;
        this.isReefer = isReefer;
        this.isTemperatureControlled = isTemperatureControlled;
        this.isDangerous = isDangerous;
    }

    public String getCorrelationId() {
        return correlationId;
    }

    public void setCorrelationId(String correlationId) {
        this.correlationId = correlationId;
    }

    public List<Party> getParties() {
        return parties;
    }

    public void setParties(List<Party> parties) {
        this.parties = parties;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public List<EquipmentAndHaulage> getEquipmentAndHaulage() {
        return equipmentAndHaulage;
    }

    public void setEquipmentAndHaulage(List<EquipmentAndHaulage> equipmentAndHaulage) {
        this.equipmentAndHaulage = equipmentAndHaulage;
    }

    public References getReferences() {
        return references;
    }

    public void setReferences(References references) {
        this.references = references;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public CargoPackage getCargoPackage() {
        return cargoPackage;
    }

    public void setCargoPackage(CargoPackage cargoPackage) {
        this.cargoPackage = cargoPackage;
    }

    public List<ActivityTask> getActivityTasks() {
        return activityTasks;
    }

    public void setActivityTasks(List<ActivityTask> activityTasks) {
        this.activityTasks = activityTasks;
    }

    public ShipmentStatus getShipmentStatus() {
        return shipmentStatus;
    }

    public void setShipmentStatus(ShipmentStatus shipmentStatus) {
        this.shipmentStatus = shipmentStatus;
    }

    public String getBusinessUnit() {
        return businessUnit;
    }

    public void setBusinessUnit(String businessUnit) {
        this.businessUnit = businessUnit;
    }

    public boolean getIsContainerGatedIn() {
        return isContainerGatedIn;
    }

    public void setIsContainerGatedIn(boolean containerGatedIn) {
        isContainerGatedIn = containerGatedIn;
    }

    public boolean getIsContainerPickedUp() {
        return isContainerPickedUp;
    }

    public void setIsContainerPickedUp(boolean containerPickedUp) {
        isContainerPickedUp = containerPickedUp;
    }

    public boolean getIsReefer() {
        return isReefer;
    }

    public void setIsReefer(boolean reefer) {
        isReefer = reefer;
    }

    public boolean getIsTemperatureControlled() {
        return isTemperatureControlled;
    }

    public void setIsTemperatureControlled(boolean temperatureControlled) {
        isTemperatureControlled = temperatureControlled;
    }

    public boolean getIsDangerous() {
        return isDangerous;
    }

    public void setIsDangerous(boolean dangerous) {
        isDangerous = dangerous;
    }
}
