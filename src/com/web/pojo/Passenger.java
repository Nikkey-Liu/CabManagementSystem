package com.web.pojo;



public class Passenger extends User {
   
    private Integer passengerid;

    private String passengername;
   
    private String passengerpassword;

   
    public Integer getPassengerid() {
        return passengerid;
    }

   
    public void setPassengerid(Integer passengerid) {
        this.passengerid = passengerid;
    }

   
    public String getPassengername() {
        return passengername;
    }

   
    public void setPassengername(String passengername) {
        this.passengername = passengername == null ? null : passengername.trim();
    }

   

   
  
    public String getPassengerpassword() {
        return passengerpassword;
    }

   
    public void setPassengerpassword(String passengerpassword) {
        this.passengerpassword = passengerpassword == null ? null : passengerpassword.trim();
    }
}