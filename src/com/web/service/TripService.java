package com.web.service;

import java.util.List;

import com.web.pojo.Trip;


public interface TripService {
   
	public int deleteTrip(Integer tripid);

    public  List<Trip>  findByPassengerId(Integer passengerid);
    public  List<Trip>  findByDriverId(Integer driverid);
    public List<Trip> viewTripList(Trip record);
}