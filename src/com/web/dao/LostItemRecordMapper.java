package com.web.dao;

import java.util.List;

import com.web.pojo.EmergencyRecord;
import com.web.pojo.LostItemRecord;

public interface LostItemRecordMapper {
   
    int deleteByPrimaryKey(Integer itemid);

   
    int insert(LostItemRecord record);

   
    int insertSelective(LostItemRecord record);

   
    LostItemRecord selectByPrimaryKey(Integer itemid);

   
    int updateByPrimaryKeySelective(LostItemRecord record);

   
    int updateByPrimaryKey(LostItemRecord record);
    
    public List<LostItemRecord> selectLostItemRecordList(LostItemRecord record);
    
    public int selectListCount(LostItemRecord record);
}