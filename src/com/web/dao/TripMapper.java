package com.web.dao;

import java.util.List;

import com.web.pojo.Trip;
import com.web.pojo.TripApply;


public interface TripMapper {
   
    int deleteByPrimaryKey(Integer tripid);

   
    int insert(Trip record);

   
    int insertSelective(Trip record);

   
    Trip selectByPrimaryKey(Integer tripid);

   
    int updateByPrimaryKeySelective(Trip record);

   
    int updateByPrimaryKey(Trip record);

    public int selectListCount(Trip record);
    public List<Trip> selectTripList(Trip record);
}