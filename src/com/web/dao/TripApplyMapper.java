package com.web.dao;

import java.util.List;


import com.web.pojo.TripApply;

public interface TripApplyMapper {
   
    int deleteByPrimaryKey(Integer tripapplyid);

   
    int insert(TripApply record);

   
    int insertSelective(TripApply record);

   
    TripApply selectByPrimaryKey(Integer tripapplyid);

   
    int updateByPrimaryKeySelective(TripApply record);

   
    int updateByPrimaryKey(TripApply record);

    
    public List<TripApply> selectTripApplyList(TripApply record);
}