package com.web.service.vehicleType;

public class LuxuryCarDecorator extends VehicleDecorator{

	public LuxuryCarDecorator(IVehicleType iVehicle) {
		super(iVehicle);
	
	}

	public String getVehicleType() {
		String vehicleType=super.getVehicleType()+"LuxuryCar";
		return vehicleType;
		
	}
	

}
