package com.web.service.vehicleType;

public class CompactCarDecorator extends VehicleDecorator {

	public CompactCarDecorator(IVehicleType iVehicle) {
		super(iVehicle);
	
	}

	public String getVehicleType() {
		String vehicleType=super.getVehicleType()+" CompactCar";
		return vehicleType;
	}

}
