package com.web.test_;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.web.service.promotions.Deals;
import com.web.service.promotions.IObserver;
import com.web.service.promotions.PassengerForDeals;


public class ObserverTest {

	@Test
	public void Test(){
		List<String> passengerEmail =new ArrayList<String>();
	PassengerForDeals dealsPassenger1 = new PassengerForDeals("Sonia");
	
	
	PassengerForDeals dealsPassenger2 = new PassengerForDeals("Maria");
	
	
	PassengerForDeals dealsPassenger3 = new PassengerForDeals("IRA");
	
	
	PassengerForDeals dealsPassenger4 = new PassengerForDeals("Razia");
	
	
	  
	Deals christmasDeal = new Deals("Christmas Deal","Available");
	
		
	christmasDeal.registerPassenger(dealsPassenger1);
	

	
	christmasDeal.registerPassenger(dealsPassenger3);
	
	
	christmasDeal.registerPassenger(dealsPassenger4);
	
	christmasDeal.setAvailablity("Available");
		

	
	}
}
