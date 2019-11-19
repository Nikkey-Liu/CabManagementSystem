package com.web.service.decorator;

public class LuxuryCarDecorator extends VehicleDecorator{

	public LuxuryCarDecorator(IVehicle iVehicle) {
		super(iVehicle);
	
	}

	@Override
	public void setVehicleType(String vehicleType) {
		vehicleType=vehicleType+" LuxuryCar";
		iVehicle.setVehicleType(vehicleType);
		
	}
	

}
