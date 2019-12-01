package com.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.web.dao.TripApplyMapper;
import com.web.pojo.TripApply;
@Service("tripApplyService")
@Transactional
public class TripApplyServiceImpl implements TripApplyService {
	@Autowired
	TripApplyMapper tripApplyMapper;
	@Override
	public int deleteTripApplys(Integer tripapplyid) {
	
		return tripApplyMapper.deleteByPrimaryKey(tripapplyid);
	}

	@Override
	public List<TripApply> findTripApplyByPassengerId(Integer passengerid) {
	
		return null;
	}

	@Override
	public List<TripApply> viewList(TripApply record) {
		
		return tripApplyMapper.selectTripApplyList(record);
	}

	

}
