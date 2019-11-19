package com.web.pojo;

import java.util.Date;

public class LostItemRecord {
   
    private Integer itemid;

   
    private String itemname;

   
    private Integer vehicleid;

   
    private String itemdescription;

   
    private String triporigin;

   
    private String tripdestination;

   
    private Date recorddate;

   
    public Integer getItemid() {
        return itemid;
    }

   
    public void setItemid(Integer itemid) {
        this.itemid = itemid;
    }

   
    public String getItemname() {
        return itemname;
    }

   
    public void setItemname(String itemname) {
        this.itemname = itemname == null ? null : itemname.trim();
    }

   
    public Integer getVehicleid() {
        return vehicleid;
    }

   
    public void setVehicleid(Integer vehicleid) {
        this.vehicleid = vehicleid;
    }

   
    public String getItemdescription() {
        return itemdescription;
    }

   
    public void setItemdescription(String itemdescription) {
        this.itemdescription = itemdescription == null ? null : itemdescription.trim();
    }

   
    public String getTriporigin() {
        return triporigin;
    }

   
    public void setTriporigin(String triporigin) {
        this.triporigin = triporigin == null ? null : triporigin.trim();
    }

   
    public String getTripdestination() {
        return tripdestination;
    }

   
    public void setTripdestination(String tripdestination) {
        this.tripdestination = tripdestination == null ? null : tripdestination.trim();
    }

   
    public Date getRecorddate() {
        return recorddate;
    }

   
    public void setRecorddate(Date recorddate) {
        this.recorddate = recorddate;
    }
}