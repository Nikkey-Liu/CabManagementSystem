package com.web.service.decorator;

public class EcononmyCarDecorator extends VehicleDecorator {

	public EcononmyCarDecorator(IVehicle iVehicle) {
		super(iVehicle);
		
	}

	@Override
	public void setVehicleType(String vehicleType) {
		vehicleType=vehicleType+" EcononmyCar";
		iVehicle.setVehicleType(vehicleType);
		
	}
	

}
