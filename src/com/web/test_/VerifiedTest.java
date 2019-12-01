package com.web.test_;

import com.web.service.verification.Car;
import com.web.service.verification.CarInvoker;
import com.web.service.verification.CarVerifiedFailed_Command;
import com.web.service.verification.CarVerifiedSuccess_Command;
import com.web.service.verification.Command;

/* The test client class or client */
public class VerifiedTest{
	public static void main(String []args){
		Car car = getCar();
		Command verifiedSuccess = new CarVerifiedSuccess_Command(car);
		Command verifiedFailed = new CarVerifiedFailed_Command(car);
		
		
		CarInvoker remote = new CarInvoker();
		 
		//NOTICE!
		//Although the Receiver class  ( Light ) can be invoked, it actually has violate the command pattern principle, that -> invoker call the receiver.
		//lamp.turnOn();
		
		remote.executeCommand(verifiedSuccess);

		remote.undo();
		remote.executeCommand(verifiedFailed);
		remote.undo();
	}
	//Class cannot be instancated within the static funtion 
	
	public static Car getCar(){ // Factory Method Here
		return new Car(); 
	}
	
} 