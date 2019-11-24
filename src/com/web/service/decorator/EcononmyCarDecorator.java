package com.web.service.decorator;

public class EcononmyCarDecorator extends VehicleDecorator {

	public EcononmyCarDecorator(IVehicle iVehicle) {
		super(iVehicle);
		
	}


	@Override
	public String getVehicleType() {
	String	vehicleType=super.getVehicleType()+" EcononmyCar";
		return vehicleType;
	}
	

}
