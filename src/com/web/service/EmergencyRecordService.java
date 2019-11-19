package com.web.service;

import java.util.List;

import com.web.pojo.EmergencyRecord;

public interface EmergencyRecordService {
	
    
	public int deleteEmergencyRecord(Integer itemid);

    
	public int addEmergencyRecord(EmergencyRecord record);

    
	public List<EmergencyRecord> findEmergencyRecordByApplicantName(String applicantName);

    
	public int editEmergencyRecord(EmergencyRecord record);

    
    public List<EmergencyRecord> viewList(EmergencyRecord record);
}