package com.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.web.dao.PassengerMapper;
import com.web.dao.PassengerPaymentRecordMapper;
import com.web.pojo.PassengerPaymentRecord;
@Service("passengerPaymentRecordService")
@Transactional
public class PassengerPaymentRecordServiceImpl implements PassengerPaymentRecordService {
	@Autowired
	PassengerPaymentRecordMapper passengerPRMapper;
	@Override
	public int deletePassengerPaymentRecord(Integer paymentrecordid) {
		// TODO Auto-generated method stub
		return passengerPRMapper.deleteByPrimaryKey(paymentrecordid);
	}

	


	@Override
	public int editPassengerPaymentRecord(PassengerPaymentRecord record) {
		// TODO Auto-generated method stub
		return passengerPRMapper.updateByPrimaryKey(record);
	}

	@Override
	public List<PassengerPaymentRecord> findRecordByPassengerId(Integer passengerid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PassengerPaymentRecord> viewList(PassengerPaymentRecord record) {
		// TODO Auto-generated method stub
		return passengerPRMapper.selectPassengerPaymentRecordList(record);
	}




	@Override
	public int addPassengerPaymentRecord(PassengerPaymentRecord record) {
		// TODO Auto-generated method stub
		return passengerPRMapper.insert(record);
	}


}
