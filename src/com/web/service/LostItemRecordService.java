package com.web.service;

import java.util.List;


import com.web.pojo.LostItemRecord;

public interface LostItemRecordService {
   
	public int deleteLostItemRecord(Integer itemid);

   
    public int addLostItemRecord(LostItemRecord record);


   
    public  List<LostItemRecord>   findByItemName(String itemName);

   
    public  int editLostItemRecoder(LostItemRecord record);
    
    public List<LostItemRecord> viewList(LostItemRecord record);
}