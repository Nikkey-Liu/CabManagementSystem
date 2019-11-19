package com.web.service;

import java.util.List;


import com.web.pojo.TripApply;

public interface TripApplyService {
   
	public   int deleteTripApplys(Integer tripapplyid);

    public List<TripApply> findTripApplyByPassengerId(Integer passengerid);

    public List<TripApply> viewList(TripApply record);
}