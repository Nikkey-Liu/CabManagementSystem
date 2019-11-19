package com.web.service.decorator;

public class CompactCarDecorator extends VehicleDecorator {

	public CompactCarDecorator(IVehicle iVehicle) {
		super(iVehicle);
	
	}

	@Override
	public void setVehicleType(String vehicleType) {
		vehicleType=vehicleType+" CompactCar";
		iVehicle.setVehicleType(vehicleType);
		
	}

}
