package com.web.service;

import java.util.List;

import com.web.util.Page;

import com.web.pojo.Driver;

public interface User_DriverService {
   
	public  int deleteDriver(Integer driverid);

    public  int addDriver(Driver record);

    public  Driver findBydriverName(String driverName);
    public   Driver findBydriverId(int driverid);
    public   int editDriver(Driver record);
    
    public  Page<Driver> viewList(Driver record,Integer page, Integer rows);
}