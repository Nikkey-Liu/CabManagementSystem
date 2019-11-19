package com.web.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.web.pojo.Passenger;
@Service("user_PassengerService")
@Transactional
public class User_PassengerServiceImpl implements User_PassengerService {

	@Override
	public int deletePassenger(Integer passengerid) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int addPassenger(Passenger record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Passenger FindByPassengerId(Integer passengerid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int editPassenger(Passenger record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Passenger> viewList(Passenger record) {
		// TODO Auto-generated method stub
		return null;
	}

}
