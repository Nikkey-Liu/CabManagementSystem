package com.web.dao;

import java.util.List;


import com.web.pojo.TripSuggestion;

public interface TripSuggestionMapper {
   
    int deleteByPrimaryKey(Integer tripsuggestid);

   
    int insert(TripSuggestion record);

   
    int insertSelective(TripSuggestion record);

   
    TripSuggestion selectByPrimaryKey(Integer tripsuggestid);

   
    int updateByPrimaryKeySelective(TripSuggestion record);

   
    int updateByPrimaryKey(TripSuggestion record);

    
    public List<TripSuggestion> selectTripSuggestionList(TripSuggestion record);
}