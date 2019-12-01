package com.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.web.dao.LostItemRecordMapper;
import com.web.pojo.LostItemRecord;
@Service("lostItemRecordService")
@Transactional
public class LostItemRecordServiceImpl implements LostItemRecordService {
	@Autowired
	LostItemRecordMapper lostItemRecordMapper;
	
	@Override
	public int deleteLostItemRecord(Integer itemid) {
		// TODO Auto-generated method stub
		return lostItemRecordMapper.deleteByPrimaryKey(itemid);
	}

	@Override
	public int addLostItemRecord(LostItemRecord record) {
		// TODO Auto-generated method stub
		return lostItemRecordMapper.insert(record);
	}

	@Override
	public List<LostItemRecord> findByItemName(String itemName) {
		// TODO Auto-generated method stub
		return null;
	}

	

	@Override
	public List<LostItemRecord> viewList(LostItemRecord record) {
		// TODO Auto-generated method stub
		return lostItemRecordMapper.selectLostItemRecordList(record);
	}

	@Override
	public int editLostItemRecoder(LostItemRecord record) {
		// TODO Auto-generated method stub
		return lostItemRecordMapper.updateByPrimaryKey(record);
	}

}
