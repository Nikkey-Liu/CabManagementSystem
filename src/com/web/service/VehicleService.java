package com.web.service;



import com.web.pojo.Vehicle;
import com.web.util.Page;

public interface VehicleService {
   
	public   int deleteVehicle(Integer vehicleid);

   
    public  int addVehicle(Vehicle record);

   
    public Vehicle findByVehicleId(Integer vehicleid);
    public Vehicle findByDriverId(Integer driverid);
    public int editVehicle(Vehicle record);


    
    public Page<Vehicle> viewList(Integer page,Integer rows, Vehicle record);
}