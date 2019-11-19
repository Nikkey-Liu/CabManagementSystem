package com.web.pojo;

import java.util.Date;

public class TripSuggestion {
   
    private Integer tripsuggestid;

   
    private String origin;

   
    private String destination;

   
    private Integer driverid;

   
    private Double distance;

   
    private Date starttime;

   
    private Date endtime;

   
    private String tripstate;

   
    private Double price;

   
    private Integer capacity;

   
    private String state;

   
    public Integer getTripsuggestid() {
        return tripsuggestid;
    }

   
    public void setTripsuggestid(Integer tripsuggestid) {
        this.tripsuggestid = tripsuggestid;
    }

   
    public String getOrigin() {
        return origin;
    }

   
    public void setOrigin(String origin) {
        this.origin = origin == null ? null : origin.trim();
    }

   
    public String getDestination() {
        return destination;
    }

   
    public void setDestination(String destination) {
        this.destination = destination == null ? null : destination.trim();
    }

   
    public Integer getDriverid() {
        return driverid;
    }

   
    public void setDriverid(Integer driverid) {
        this.driverid = driverid;
    }

   
    public Double getDistance() {
        return distance;
    }

   
    public void setDistance(Double distance) {
        this.distance = distance;
    }

   
    public Date getStarttime() {
        return starttime;
    }

   
    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

   
    public Date getEndtime() {
        return endtime;
    }

   
    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

   
    public String getTripstate() {
        return tripstate;
    }

   
    public void setTripstate(String tripstate) {
        this.tripstate = tripstate == null ? null : tripstate.trim();
    }

   
    public Double getPrice() {
        return price;
    }

   
    public void setPrice(Double price) {
        this.price = price;
    }

   
    public Integer getCapacity() {
        return capacity;
    }

   
    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

   
    public String getState() {
        return state;
    }

   
    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }
}