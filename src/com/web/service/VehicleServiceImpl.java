package com.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.web.dao.DriverMapper;
import com.web.dao.VehicleMapper;

import com.web.pojo.Vehicle;
import com.web.service.decorator.CompactCarDecorator;
import com.web.service.decorator.EcononmyCarDecorator;
import com.web.service.decorator.IVehicle;
import com.web.service.decorator.LuxuryCarDecorator;
import com.web.service.decorator.VehicleAudi;
import com.web.util.Page;
@Service("vehicleService")
@Transactional
public class VehicleServiceImpl implements VehicleService {
	@Autowired
	VehicleMapper vehicleMapper;
	@Autowired
	DriverMapper driverMapper;
	@Override
	public int deleteVehicle(Integer vehicleid) {
		
		return vehicleMapper.deleteByPrimaryKey(vehicleid);
	}

	@Override
	public int addVehicle(Vehicle record) {
		String vehicleType;
          if(record.getVehicletype().equals("1")){
         IVehicle iVehicle =new CompactCarDecorator(new VehicleAudi());
        	 
        	  vehicleType=iVehicle.getVehicleType();
        	  record.setVehicletype(vehicleType);
        	  return vehicleMapper.insert(record);
          }
          if(record.getVehicletype().equals("2")){
              IVehicle iVehicle =new EcononmyCarDecorator(new VehicleAudi());
             	 
             	  vehicleType=iVehicle.getVehicleType();
             	  record.setVehicletype(vehicleType);
             	  return vehicleMapper.insert(record);
               }
          if(record.getVehicletype().equals("3")){
              IVehicle iVehicle =new LuxuryCarDecorator(new VehicleAudi());
             	 
             	  vehicleType=iVehicle.getVehicleType();
             	  record.setVehicletype(vehicleType);
             	  return vehicleMapper.insert(record);
               }
         
          
		return 0;
	}

	@Override
	public Vehicle findByVehicleId(Integer vehicleid) {
	
Vehicle vehicle=	 vehicleMapper.selectByPrimaryKey(vehicleid);
vehicle.setDrivername(driverMapper.selectByPrimaryKey(vehicle.getOwnerid()).getDrivername());
return vehicle;

	}

	@Override
	public Vehicle findByDriverId(Integer driverid) {
	
		return vehicleMapper.selectByDriverid(driverid);
	}

	@Override
	public int editVehicle(Vehicle record) {
	
		return vehicleMapper.updateByPrimaryKey(record);
	}

	@Override
	public Page<Vehicle> viewList(Integer page, Integer rows, Vehicle record) {
		Integer count = vehicleMapper.selectListCount(record);
		List<Vehicle>vehicles= vehicleMapper.selectVehicleList(record);
		String drivername;
		for (int i=0;i<vehicles.size();i++)
		{
			drivername=driverMapper.selectByPrimaryKey(vehicles.get(i).getOwnerid()).getDrivername();
		vehicles.get(i).setDrivername(drivername);	
		}
Page<Vehicle > result = new Page<Vehicle>();
result.setPage(page);
result.setRows(vehicles);
result.setTotal(count);
result.setSize(rows);
		return result;
	}



}
