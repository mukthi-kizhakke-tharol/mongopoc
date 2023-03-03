package com.example.reactive.mongodb.entity.normalized.ssib;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RouteSchedule {

    private String action;

    private String routeScheduleId;

    private Integer weekNumber;

    private String routeId;

    private String routeCode;

    private String productType;

    private String tradeLaneCode;

    @JsonAlias({"NAPCode","napCode"})
    private String napCode;

    private CardinalDirection cardinalDirection;

    private List<BookingSchedule> bookingSchedules;

    private String transitTime;

    public RouteSchedule() {
    }

    public RouteSchedule(String action, String routeScheduleId, Integer weekNumber, String routeId, String routeCode, String productType, String tradeLaneCode, String napCode, CardinalDirection cardinalDirection, List<BookingSchedule> bookingSchedules, String transitTime) {
        this.action = action;
        this.routeScheduleId = routeScheduleId;
        this.weekNumber = weekNumber;
        this.routeId = routeId;
        this.routeCode = routeCode;
        this.productType = productType;
        this.tradeLaneCode = tradeLaneCode;
        this.napCode = napCode;
        this.cardinalDirection = cardinalDirection;
        this.bookingSchedules = bookingSchedules;
        this.transitTime = transitTime;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getRouteScheduleId() {
        return routeScheduleId;
    }

    public void setRouteScheduleId(String routeScheduleId) {
        this.routeScheduleId = routeScheduleId;
    }

    public Integer getWeekNumber() {
        return weekNumber;
    }

    public void setWeekNumber(Integer weekNumber) {
        this.weekNumber = weekNumber;
    }

    public String getRouteId() {
        return routeId;
    }

    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }

    public String getRouteCode() {
        return routeCode;
    }

    public void setRouteCode(String routeCode) {
        this.routeCode = routeCode;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getTradeLaneCode() {
        return tradeLaneCode;
    }

    public void setTradeLaneCode(String tradeLaneCode) {
        this.tradeLaneCode = tradeLaneCode;
    }

    public String getNapCode() {
        return napCode;
    }

    public void setNapCode(String napCode) {
        this.napCode = napCode;
    }

    public CardinalDirection getCardinalDirection() {
        return cardinalDirection;
    }

    public void setCardinalDirection(CardinalDirection cardinalDirection) {
        this.cardinalDirection = cardinalDirection;
    }

    public List<BookingSchedule> getBookingSchedules() {
        return bookingSchedules;
    }

    public void setBookingSchedules(List<BookingSchedule> bookingSchedules) {
        this.bookingSchedules = bookingSchedules;
    }

    public String getTransitTime() {
        return transitTime;
    }

    public void setTransitTime(String transitTime) {
        this.transitTime = transitTime;
    }
}
