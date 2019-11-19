package com.web.pojo;

import java.util.Date;

public class TripApply  extends TripMaster{
   
    private Integer tripapplyid;

   
    private String tripapplystate;

   
    private Date tripapplydate;

   
    

   
    public Integer getTripapplyid() {
        return tripapplyid;
    }

   
    public void setTripapplyid(Integer tripapplyid) {
        this.tripapplyid = tripapplyid;
    }

   
    public String getTripapplystate() {
        return tripapplystate;
    }

   
    public void setTripapplystate(String tripapplystate) {
        this.tripapplystate = tripapplystate == null ? null : tripapplystate.trim();
    }

   
    public Date getTripapplydate() {
        return tripapplydate;
    }

   
    public void setTripapplydate(Date tripapplydate) {
        this.tripapplydate = tripapplydate;
    }

   
   

   
   
}