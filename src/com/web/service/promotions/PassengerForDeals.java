package com.web.service.promotions;

import com.web.pojo.Passenger;

public class PassengerForDeals extends Passenger implements IObserver {
   
	String passengerName;
	public PassengerForDeals(String passengerName){
		this.passengerName=passengerName;
	}

	@Override
	public void update(String availability) {
		System.out.println("Hello " + passengerName + ", new deals are now "+availability); 
		
	} 

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	
}
