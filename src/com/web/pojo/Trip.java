package com.web.pojo;

import java.util.Date;

public class Trip  extends TripMaster{
   
    private Integer tripid;

   
    private Date tripdate;

   
    private Integer driverid;

   
    private Integer vehicleid;

   
    private Integer reviewid;

   
    private String tripstate;

   
    public Integer getTripid() {
        return tripid;
    }

   
    public void setTripid(Integer tripid) {
        this.tripid = tripid;
    }

   
    public Date getTripdate() {
        return tripdate;
    }

   
    public void setTripdate(Date tripdate) {
        this.tripdate = tripdate;
    }

   
    public Integer getDriverid() {
        return driverid;
    }

   
    public void setDriverid(Integer driverid) {
        this.driverid = driverid;
    }

   
    public Integer getVehicleid() {
        return vehicleid;
    }

   
    public void setVehicleid(Integer vehicleid) {
        this.vehicleid = vehicleid;
    }

   
    public Integer getReviewid() {
        return reviewid;
    }

   
    public void setReviewid(Integer reviewid) {
        this.reviewid = reviewid;
    }

   
    public String getTripstate() {
        return tripstate;
    }

   
    public void setTripstate(String tripstate) {
        this.tripstate = tripstate == null ? null : tripstate.trim();
    }

   
}