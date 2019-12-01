package com.web.service.verification;

public class CarVerifiedSuccess_Command implements Command { 
	
	Car _car;
	
	public CarVerifiedSuccess_Command(Car car){ _car = car; }
	
	public void execute(){
		_car.VerifiedSuccess();
	}
	
	public void undo(){
		_car.VerifiedFailed();
	}
}