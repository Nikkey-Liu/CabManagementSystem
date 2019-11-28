package com.web.service.vehicleType;

public class EcononmyCarDecorator extends VehicleDecorator {

	public EcononmyCarDecorator(IVehicleType iVehicle) {
		super(iVehicle);
		
	}


	@Override
	public String getVehicleType() {
	String	vehicleType=super.getVehicleType()+" EcononmyCar";
		return vehicleType;
	}
	

}
