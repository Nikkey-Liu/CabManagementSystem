package com.web.service.verification;

import com.web.pojo.Vehicle;

/* The Receiver class */
public class Car extends Vehicle{
	
	
	
	// should the Light class exposed their data field as public ?
	// Or add the getter/setter parterns here??

	//No -- Because the concrete command should know about the reference of Receiver
	//Notice:
	// IF: you find that it is need more code for getting message/information like add getter/setter 
	// It must have mistake, which can be amended by changing the reference direction / dependency.
	
	public Car(){
		
	}
	
	public void VerifiedSuccess(){
		System.out.println("Verified is ** Success **.");
		this.setIsverified(true);
		showCarNumber();
	}
	
	public void VerifiedFailed(){
		System.out.println("Verified is ** Failed **.");
		this.setIsverified(false);
	}
	public void showCarNumber(){
		System.out.println(this.getChasisnumber());
	}
  
	
}