package com.web.dao;

import java.util.List;


import com.web.pojo.EmergencyRecord;

public interface EmergencyRecordMapper {
    
    int deleteByPrimaryKey(Integer itemid);

    
    int insert(EmergencyRecord record);

    
    int insertSelective(EmergencyRecord record);

    
    EmergencyRecord selectByPrimaryKey(Integer itemid);

    
    int updateByPrimaryKeySelective(EmergencyRecord record);

    
    int updateByPrimaryKey(EmergencyRecord record);
    
    public List<EmergencyRecord> selectEmergencyRecordList(EmergencyRecord record);
}