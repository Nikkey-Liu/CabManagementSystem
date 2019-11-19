package com.web.service;

import java.util.List;


import com.web.pojo.Passenger;

public interface User_PassengerService {
   
	public  int deletePassenger(Integer passengerid);

   
    public  int addPassenger(Passenger record);

    public Passenger FindByPassengerId(Integer passengerid);

   
    public  int editPassenger(Passenger record);

   

    
    public List<Passenger> viewList(Passenger record);
}