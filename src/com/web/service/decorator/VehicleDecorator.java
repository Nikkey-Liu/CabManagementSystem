package com.web.service.decorator;

public class VehicleDecorator extends IVehicle {
    
	protected IVehicle iVehicle;
	
	public VehicleDecorator(IVehicle iVehicle)
	{
		this.iVehicle=iVehicle;
	}
	

	public String getVehicleType() {
		
		return iVehicle.getVehicleType();
	}
}
