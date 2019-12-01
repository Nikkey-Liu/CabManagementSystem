package com.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.web.dao.PassengerMapper;
import com.web.pojo.Passenger;
@Service("user_PassengerService")
@Transactional
public class User_PassengerServiceImpl implements User_PassengerService {
	@Autowired
	PassengerMapper passengerMapper;
	@Override
	public int deletePassenger(Integer passengerid) {
		
		return passengerMapper.deleteByPrimaryKey(passengerid);
	}

	@Override
	public int addPassenger(Passenger record) {
		// TODO Auto-generated method stub
		return passengerMapper.insert(record);
	}

	@Override
	public Passenger FindByPassengerId(Integer passengerid) {
		// TODO Auto-generated method stub
		return passengerMapper.selectByPrimaryKey(passengerid);
	}

	@Override
	public int editPassenger(Passenger record) {
		// TODO Auto-generated method stub
		return passengerMapper.updateByPrimaryKey(record);
	}

	@Override
	public List<Passenger> viewList(Passenger record) {
		// TODO Auto-generated method stub
		return passengerMapper.selectPassengerList(record);
	}

	@Override
	public Passenger findByPassengerName(String passengerNAME) {
		// TODO Auto-generated method stub
		return null;
	}

}
