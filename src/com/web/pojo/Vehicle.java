package com.web.pojo;

import com.web.service.decorator.IVehicle;

public class Vehicle implements IVehicle {
   
    private Integer vehicleid;

   private String vehicleType;
   
   //for decorator
   public String getVehicleType ()
   {
	   return this.vehicleType;
   }
   
    private String vehiclenumber;

   
    private String manufacturer;

   
    private String model;

   
    private String color;

   
    private String enginenumber;

   
    private String chasisnumber;

   
    private Integer ownerid;

   
    private Integer capacity;

   
    public Integer getVehicleid() {
        return vehicleid;
    }

   
    public void setVehicleid(Integer vehicleid) {
        this.vehicleid = vehicleid;
    }

   
    public String getVehiclenumber() {
        return vehiclenumber;
    }

   
    public void setVehiclenumber(String vehiclenumber) {
        this.vehiclenumber = vehiclenumber == null ? null : vehiclenumber.trim();
    }

   
    public String getManufacturer() {
        return manufacturer;
    }

   
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer == null ? null : manufacturer.trim();
    }

   
    public String getModel() {
        return model;
    }

   
    public void setModel(String model) {
        this.model = model == null ? null : model.trim();
    }

   
    public String getColor() {
        return color;
    }

   
    public void setColor(String color) {
        this.color = color == null ? null : color.trim();
    }

   
    public String getEnginenumber() {
        return enginenumber;
    }

   
    public void setEnginenumber(String enginenumber) {
        this.enginenumber = enginenumber == null ? null : enginenumber.trim();
    }

   
    public String getChasisnumber() {
        return chasisnumber;
    }

   
    public void setChasisnumber(String chasisnumber) {
        this.chasisnumber = chasisnumber == null ? null : chasisnumber.trim();
    }

   
    public Integer getOwnerid() {
        return ownerid;
    }

   
    public void setOwnerid(Integer ownerid) {
        this.ownerid = ownerid;
    }

   
    public Integer getCapacity() {
        return capacity;
    }

   
    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }


	@Override
	public void setVehicleType(String vehicleType) {
	
		this.vehicleType=vehicleType;
	}
}