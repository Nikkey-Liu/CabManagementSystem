package com.web.dao;

import java.util.List;

import com.web.pojo.Passenger;
import com.web.pojo.PassengerPaymentRecord;

public interface PassengerPaymentRecordMapper {
   
    int deleteByPrimaryKey(Integer paymentrecordid);

   
    int insert(PassengerPaymentRecord record);

   
    int insertSelective(PassengerPaymentRecord record);

   
    PassengerPaymentRecord selectByPrimaryKey(Integer paymentrecordid);

   
    int updateByPrimaryKeySelective(PassengerPaymentRecord record);

   
    int updateByPrimaryKey(PassengerPaymentRecord record);

    public int selectListCount(PassengerPaymentRecord record);
    public List<PassengerPaymentRecord> selectPassengerPaymentRecordList(PassengerPaymentRecord record);
}