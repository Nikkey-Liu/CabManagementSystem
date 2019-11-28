package com.web.service.promotions;

import com.web.pojo.Passenger;

public class PassengerForDeals extends Passenger implements IObserver {
    public ISubject getSubject() {
		return subject;
	}

	public void setSubject(ISubject subject) {
		this.subject = subject;
	}

	private ISubject subject;

	@Override
	public void update(String dealName, String passengerEmail) {
		System.out.println("Hello " + passengerEmail + ", " + dealName + " is now available"); 
		
	}
	
}
