package com.web.service.verification;

public class CarVerifiedFailed_Command implements Command { 
	
	Car _car;
	
	public CarVerifiedFailed_Command(Car car){ _car = car; }
	
	public void execute(){
		_car.VerifiedFailed();
	}
	
	public void undo(){
		_car.VerifiedSuccess();
	}
}