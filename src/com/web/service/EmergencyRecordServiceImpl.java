package com.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.web.dao.EmergencyRecordMapper;
import com.web.pojo.EmergencyRecord;
@Service("emergencyRecordService")
@Transactional
public class EmergencyRecordServiceImpl implements EmergencyRecordService {
	@Autowired
	EmergencyRecordMapper emergencyRecordMapper;
	@Override
	public int deleteEmergencyRecord(Integer itemid) {
		// TODO Auto-generated method stub
		return emergencyRecordMapper.deleteByPrimaryKey(itemid);
	}

	@Override
	public int addEmergencyRecord(EmergencyRecord record) {
		// TODO Auto-generated method stub
		return emergencyRecordMapper.insert(record);
	}

	@Override
	public List<EmergencyRecord> findEmergencyRecordByApplicantName(String applicantName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int editEmergencyRecord(EmergencyRecord record) {
		// TODO Auto-generated method stub
		return emergencyRecordMapper.updateByPrimaryKey(record);
	}

	@Override
	public List<EmergencyRecord> viewList(EmergencyRecord record) {
		// TODO Auto-generated method stub
		return emergencyRecordMapper.selectEmergencyRecordList(record);
	}

}
