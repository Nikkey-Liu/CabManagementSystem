package com.web.dao;

import java.util.List;

import com.web.pojo.TripSuggestion;
import com.web.pojo.Vehicle;

public interface VehicleMapper {
   
    int deleteByPrimaryKey(Integer vehicleid);

   
    int insert(Vehicle record);

   
    int insertSelective(Vehicle record);

   
    Vehicle selectByPrimaryKey(Integer vehicleid);

    Vehicle selectByDriverid(Integer driverid);
    int updateByPrimaryKeySelective(Vehicle record);

   
    int updateByPrimaryKey(Vehicle record);
    public int selectListCount(Vehicle record);
    public List<Vehicle> selectVehicleList(Vehicle record);
}