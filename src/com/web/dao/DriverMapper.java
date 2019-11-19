package com.web.dao;

import java.util.List;


import com.web.pojo.Driver;

public interface DriverMapper {
   
    int deleteByPrimaryKey(int driverid);

   
    int insert(Driver record);

   
    int insertSelective(Driver record);

   
    Driver selectByPrimaryKey(int driverid);

   
    int updateByPrimaryKeySelective(Driver record);

   
    int updateByPrimaryKey(Driver record);
    
    public List<Driver> selectDriverList(Driver record);
    public int selectDriverListCount(Driver record);
}