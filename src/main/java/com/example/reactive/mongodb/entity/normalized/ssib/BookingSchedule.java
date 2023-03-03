package com.example.reactive.mongodb.entity.normalized.ssib;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.time.LocalDateTime;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BookingSchedule {

    private String routeLinkId;

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss", shape = JsonFormat.Shape.STRING)
    private LocalDateTime originDepartureDateTimeLocal;
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss", shape = JsonFormat.Shape.STRING)
    private LocalDateTime destinationArrivalDateTimeLocal;
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss", shape = JsonFormat.Shape.STRING)
    private LocalDateTime originDepartureDateTimeUTC;
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss", shape = JsonFormat.Shape.STRING)
    private LocalDateTime destinationArrivalDateTimeUTC;

    private TransportMode transportMode;

    private Integer layoverTime;

    private String routingType;

    private String serviceCode;

    private String routingSequence;

    private Location startLocation;

    private Location endLocation;

    private String inlandCarrierCode;

    private String carrierName;

    private String transportModeCode;

    private Integer transitTime;

    private String transitTimeUnits;

    private List<AcceptanceConditions> acceptanceConditions;

    public BookingSchedule() {
    }

    public BookingSchedule(String routeLinkId, LocalDateTime originDepartureDateTimeLocal, LocalDateTime destinationArrivalDateTimeLocal, LocalDateTime originDepartureDateTimeUTC, LocalDateTime destinationArrivalDateTimeUTC, TransportMode transportMode, Integer layoverTime, String routingType, String serviceCode, String routingSequence, Location startLocation, Location endLocation, String inlandCarrierCode, String carrierName, String transportModeCode, Integer transitTime, String transitTimeUnits, List<AcceptanceConditions> acceptanceConditions) {
        this.routeLinkId = routeLinkId;
        this.originDepartureDateTimeLocal = originDepartureDateTimeLocal;
        this.destinationArrivalDateTimeLocal = destinationArrivalDateTimeLocal;
        this.originDepartureDateTimeUTC = originDepartureDateTimeUTC;
        this.destinationArrivalDateTimeUTC = destinationArrivalDateTimeUTC;
        this.transportMode = transportMode;
        this.layoverTime = layoverTime;
        this.routingType = routingType;
        this.serviceCode = serviceCode;
        this.routingSequence = routingSequence;
        this.startLocation = startLocation;
        this.endLocation = endLocation;
        this.inlandCarrierCode = inlandCarrierCode;
        this.carrierName = carrierName;
        this.transportModeCode = transportModeCode;
        this.transitTime = transitTime;
        this.transitTimeUnits = transitTimeUnits;
        this.acceptanceConditions = acceptanceConditions;
    }

    public String getRouteLinkId() {
        return routeLinkId;
    }

    public void setRouteLinkId(String routeLinkId) {
        this.routeLinkId = routeLinkId;
    }

    public LocalDateTime getOriginDepartureDateTimeLocal() {
        return originDepartureDateTimeLocal;
    }

    public void setOriginDepartureDateTimeLocal(LocalDateTime originDepartureDateTimeLocal) {
        this.originDepartureDateTimeLocal = originDepartureDateTimeLocal;
    }

    public LocalDateTime getDestinationArrivalDateTimeLocal() {
        return destinationArrivalDateTimeLocal;
    }

    public void setDestinationArrivalDateTimeLocal(LocalDateTime destinationArrivalDateTimeLocal) {
        this.destinationArrivalDateTimeLocal = destinationArrivalDateTimeLocal;
    }

    public LocalDateTime getOriginDepartureDateTimeUTC() {
        return originDepartureDateTimeUTC;
    }

    public void setOriginDepartureDateTimeUTC(LocalDateTime originDepartureDateTimeUTC) {
        this.originDepartureDateTimeUTC = originDepartureDateTimeUTC;
    }

    public LocalDateTime getDestinationArrivalDateTimeUTC() {
        return destinationArrivalDateTimeUTC;
    }

    public void setDestinationArrivalDateTimeUTC(LocalDateTime destinationArrivalDateTimeUTC) {
        this.destinationArrivalDateTimeUTC = destinationArrivalDateTimeUTC;
    }

    public TransportMode getTransportMode() {
        return transportMode;
    }

    public void setTransportMode(TransportMode transportMode) {
        this.transportMode = transportMode;
    }

    public Integer getLayoverTime() {
        return layoverTime;
    }

    public void setLayoverTime(Integer layoverTime) {
        this.layoverTime = layoverTime;
    }

    public String getRoutingType() {
        return routingType;
    }

    public void setRoutingType(String routingType) {
        this.routingType = routingType;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public String getRoutingSequence() {
        return routingSequence;
    }

    public void setRoutingSequence(String routingSequence) {
        this.routingSequence = routingSequence;
    }

    public Location getStartLocation() {
        return startLocation;
    }

    public void setStartLocation(Location startLocation) {
        this.startLocation = startLocation;
    }

    public Location getEndLocation() {
        return endLocation;
    }

    public void setEndLocation(Location endLocation) {
        this.endLocation = endLocation;
    }

    public String getInlandCarrierCode() {
        return inlandCarrierCode;
    }

    public void setInlandCarrierCode(String inlandCarrierCode) {
        this.inlandCarrierCode = inlandCarrierCode;
    }

    public String getCarrierName() {
        return carrierName;
    }

    public void setCarrierName(String carrierName) {
        this.carrierName = carrierName;
    }

    public String getTransportModeCode() {
        return transportModeCode;
    }

    public void setTransportModeCode(String transportModeCode) {
        this.transportModeCode = transportModeCode;
    }

    public Integer getTransitTime() {
        return transitTime;
    }

    public void setTransitTime(Integer transitTime) {
        this.transitTime = transitTime;
    }

    public String getTransitTimeUnits() {
        return transitTimeUnits;
    }

    public void setTransitTimeUnits(String transitTimeUnits) {
        this.transitTimeUnits = transitTimeUnits;
    }

    public List<AcceptanceConditions> getAcceptanceConditions() {
        return acceptanceConditions;
    }

    public void setAcceptanceConditions(List<AcceptanceConditions> acceptanceConditions) {
        this.acceptanceConditions = acceptanceConditions;
    }
}
