package com.web.dao;

import java.util.List;


import com.web.pojo.Passenger;

public interface PassengerMapper {
   
    int deleteByPrimaryKey(Integer passengerid);

   
    int insert(Passenger record);

   
    int insertSelective(Passenger record);

   
    Passenger selectByPrimaryKey(Integer passengerid);

   
    int updateByPrimaryKeySelective(Passenger record);

   
    int updateByPrimaryKey(Passenger record);
    

    
    public List<Passenger> selectPassengerList(Passenger record);
}