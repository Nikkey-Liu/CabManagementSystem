package com.web.pojo;



public class Driver extends User {
   
    private Integer driverid;

   
    private String drivername;

  
    private Boolean driverstate;

   
   
    private String driverpassword;

   
    public Integer getDriverid() {
        return driverid;
    }

   
    public void setDriverid(Integer driverid) {
        this.driverid = driverid;
    }

   
    public String getDrivername() {
        return drivername;
    }

   
    public void setDrivername(String drivername) {
        this.drivername = drivername == null ? null : drivername.trim();
    }

   
   
   
    public Boolean getDriverstate() {
        return driverstate;
    }

   
    public void setDriverstate(Boolean driverstate) {
        this.driverstate = driverstate;
    }

   
    public String getDriverpassword() {
        return driverpassword;
    }

   
    public void setDriverpassword(String driverpassword) {
        this.driverpassword = driverpassword == null ? null : driverpassword.trim();
    }
}