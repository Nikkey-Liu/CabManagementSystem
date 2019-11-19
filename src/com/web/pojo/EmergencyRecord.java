package com.web.pojo;

import java.util.Date;

public class EmergencyRecord {
   
    private Integer itemid;

   
    private String description;

   
    private String applicantname;

   
    private String emergencystate;

   
    private Integer emergencyprocessorid;

   
    private Date eventtime;

   
    public Integer getItemid() {
        return itemid;
    }

   
    public void setItemid(Integer itemid) {
        this.itemid = itemid;
    }

   
    public String getDescription() {
        return description;
    }

   
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

   
    public String getApplicantname() {
        return applicantname;
    }

   
    public void setApplicantname(String applicantname) {
        this.applicantname = applicantname == null ? null : applicantname.trim();
    }

   
    public String getEmergencystate() {
        return emergencystate;
    }

   
    public void setEmergencystate(String emergencystate) {
        this.emergencystate = emergencystate == null ? null : emergencystate.trim();
    }

   
    public Integer getEmergencyprocessorid() {
        return emergencyprocessorid;
    }

   
    public void setEmergencyprocessorid(Integer emergencyprocessorid) {
        this.emergencyprocessorid = emergencyprocessorid;
    }

   
    public Date getEventtime() {
        return eventtime;
    }

   
    public void setEventtime(Date eventtime) {
        this.eventtime = eventtime;
    }
}