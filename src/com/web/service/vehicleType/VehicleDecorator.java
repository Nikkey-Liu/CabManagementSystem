package com.web.service.vehicleType;

public class VehicleDecorator extends IVehicleType {
    
	protected IVehicleType iVehicle;
	
	public VehicleDecorator(IVehicleType iVehicle)
	{
		this.iVehicle=iVehicle;
	}
	

	public String getVehicleType() {
		
		return iVehicle.getVehicleType();
	}
}
