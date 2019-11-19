package com.web.service.decorator;

public abstract class VehicleDecorator implements IVehicle {
    
	protected IVehicle iVehicle;
	public VehicleDecorator(IVehicle iVehicle)
	{
		this.iVehicle=iVehicle;
	}
	public void addVehicleType(String vehicleType) {
		
	iVehicle.setVehicleType(vehicleType);
	}
}
