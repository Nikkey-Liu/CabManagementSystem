package com.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.web.dao.TripMapper;
import com.web.pojo.Trip;
@Service("tripService")
@Transactional
public class TripServiceImpl implements TripService {
	@Autowired
	TripMapper tripMapper;
	@Override
	public int deleteTrip(Integer tripid) {
	
		return tripMapper.deleteByPrimaryKey(tripid);
	}

	@Override
	public List<Trip> findByPassengerId(Integer passengerid) {
	
		return null;
	}

	@Override
	public List<Trip> findByDriverId(Integer driverid) {
		
		return null;
	}

	@Override
	public List<Trip> viewTripList(Trip record) {
		
		return tripMapper.selectTripList(record);
	}

}
