package com.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.web.util.Page;

import com.web.dao.DriverMapper;
import com.web.pojo.Driver;
@Service("user_DriverService")
@Transactional
public class User_DriverServiceImpl implements User_DriverService {
	@Autowired
    DriverMapper driverMapper;
	@Override
	public int deleteDriver(Integer driverid) {
		
		return driverMapper.deleteByPrimaryKey(driverid);
	}

	@Override
	public int addDriver(Driver record) {
		
		return driverMapper.insert(record);
	}

	@Override
	public Driver findBydriverName(String driverName) {
		
		return null;
	}

	@Override
	public Driver findBydriverId(int driverid) {
		
		return driverMapper.selectByPrimaryKey(driverid);
	}

	@Override
	public int editDriver(Driver record) {
		
		return driverMapper.updateByPrimaryKey(record);
	}

	@Override
	public Page<Driver> viewList(Driver record,Integer page, Integer rows) {
		// TODO Auto-generated method stub
		// 查询客户列表总记录数
					Integer count = driverMapper.selectDriverListCount(record);
					List<Driver>drivers= driverMapper.selectDriverList(record);
		Page<Driver > result = new Page<Driver>();
		result.setPage(page);
		result.setRows(drivers);
		result.setTotal(count);
		result.setSize(rows);
		
		return result;
	}

}
