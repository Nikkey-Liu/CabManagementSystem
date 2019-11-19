package com.web.service;

import java.util.List;


import com.web.pojo.PassengerPaymentRecord;

public interface PassengerPaymentRecordService {
   
	public  int deletePassengerPaymentRecord(Integer paymentrecordid);

   
    public int insertPassengerPaymentRecord(PassengerPaymentRecord record);

   
    public  List<PassengerPaymentRecord> selectRecordByPassengerId(Integer passengerid);

   
    public int editPassengerPaymentRecord(PassengerPaymentRecord record);
    
    public List<PassengerPaymentRecord> selectList(PassengerPaymentRecord record);
}