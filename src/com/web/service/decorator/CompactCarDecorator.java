package com.web.service.decorator;

public class CompactCarDecorator extends VehicleDecorator {

	public CompactCarDecorator(IVehicle iVehicle) {
		super(iVehicle);
	
	}

	public String getVehicleType() {
		String vehicleType=super.getVehicleType()+" CompactCar";
		return vehicleType;
	}

}
