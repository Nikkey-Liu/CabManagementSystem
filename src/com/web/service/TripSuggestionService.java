package com.web.service;

import java.util.List;


import com.web.pojo.TripSuggestion;

public interface TripSuggestionService {
   
	public int deleteTripSuggestion(Integer tripsuggestid);

	public  int addTripSuggestion(TripSuggestion record);

	public  List<TripSuggestion> findTripSuggestionByDriverId(Integer driverid);

	public  int editTripSuggestion(TripSuggestion record);
	
    public List<TripSuggestion> viewList(TripSuggestion record);
}