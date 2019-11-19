package com.web.service;

import java.util.List;


import com.web.pojo.Vehicle;

public interface VehicleService {
   
	public   int deleteVehicle(Integer vehicleid);

   
    public  int addVehicle(Vehicle record);

   
    public Vehicle findByVehicleId(Integer vehicleid);
    public Vehicle findByDriverId(Integer driverid);
    public int editVehicle(Vehicle record);


    
    public List<Vehicle> viewList(Vehicle record);
}