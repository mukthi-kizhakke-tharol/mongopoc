package com.example.reactive.mongodb.entity.normalized.ssib;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RouteDetails {

    private Location placeOfReceipt;

    private Location placeOfDelivery;

    private Location preferredLoadPort;

    private Location preferredDischargePort;

    private Location alternatePickupLocation;

    private RouteSchedule selectedRoute;

    public RouteDetails() {
    }

    public RouteDetails(Location placeOfReceipt, Location placeOfDelivery, Location preferredLoadPort, Location preferredDischargePort, Location alternatePickupLocation, RouteSchedule selectedRoute) {
        this.placeOfReceipt = placeOfReceipt;
        this.placeOfDelivery = placeOfDelivery;
        this.preferredLoadPort = preferredLoadPort;
        this.preferredDischargePort = preferredDischargePort;
        this.alternatePickupLocation = alternatePickupLocation;
        this.selectedRoute = selectedRoute;
    }

    public Location getPlaceOfReceipt() {
        return placeOfReceipt;
    }

    public void setPlaceOfReceipt(Location placeOfReceipt) {
        this.placeOfReceipt = placeOfReceipt;
    }

    public Location getPlaceOfDelivery() {
        return placeOfDelivery;
    }

    public void setPlaceOfDelivery(Location placeOfDelivery) {
        this.placeOfDelivery = placeOfDelivery;
    }

    public Location getPreferredLoadPort() {
        return preferredLoadPort;
    }

    public void setPreferredLoadPort(Location preferredLoadPort) {
        this.preferredLoadPort = preferredLoadPort;
    }

    public Location getPreferredDischargePort() {
        return preferredDischargePort;
    }

    public void setPreferredDischargePort(Location preferredDischargePort) {
        this.preferredDischargePort = preferredDischargePort;
    }

    public Location getAlternatePickupLocation() {
        return alternatePickupLocation;
    }

    public void setAlternatePickupLocation(Location alternatePickupLocation) {
        this.alternatePickupLocation = alternatePickupLocation;
    }

    public RouteSchedule getSelectedRoute() {
        return selectedRoute;
    }

    public void setSelectedRoute(RouteSchedule selectedRoute) {
        this.selectedRoute = selectedRoute;
    }
}
