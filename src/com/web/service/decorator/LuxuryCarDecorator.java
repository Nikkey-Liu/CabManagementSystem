package com.web.service.decorator;

public class LuxuryCarDecorator extends VehicleDecorator{

	public LuxuryCarDecorator(IVehicle iVehicle) {
		super(iVehicle);
	
	}

	public String getVehicleType() {
		String vehicleType=super.getVehicleType()+"LuxuryCar";
		return vehicleType;
		
	}
	

}
