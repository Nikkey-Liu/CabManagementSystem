package com.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.web.dao.TripSuggestionMapper;
import com.web.pojo.TripSuggestion;
@Service("tripSuggestionService")
@Transactional
public class TripSuggestionServiceImpl implements TripSuggestionService {
	@Autowired
	TripSuggestionMapper tripSuggestionMapper;
	@Override
	public int deleteTripSuggestion(Integer tripsuggestid) {
		
		return tripSuggestionMapper.deleteByPrimaryKey(tripsuggestid);
	}

	@Override
	public int addTripSuggestion(TripSuggestion record) {
		
		return tripSuggestionMapper.insert(record);
	}

	@Override
	public List<TripSuggestion> findTripSuggestionByDriverId(Integer driverid) {
		
		return null;
	}

	@Override
	public int editTripSuggestion(TripSuggestion record) {
	
		return tripSuggestionMapper.updateByPrimaryKey(record);
	}

	@Override
	public List<TripSuggestion> viewList(TripSuggestion record) {
		
		return tripSuggestionMapper.selectTripSuggestionList(record) ;
	}

}
