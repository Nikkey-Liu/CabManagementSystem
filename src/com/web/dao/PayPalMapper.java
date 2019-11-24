package com.web.dao;

import java.util.List;

import com.web.pojo.Admin;
import com.web.pojo.PayPal;

public interface PayPalMapper {
   
    int deleteByPrimaryKey(Integer paypalid);

   
    int insert(PayPal record);

   
    int insertSelective(PayPal record);

   
    PayPal selectByPrimaryKey(Integer paypalid);

   
    int updateByPrimaryKeySelective(PayPal record);

   
    int updateByPrimaryKey(PayPal record);

    public int selectListCount(PayPal record);
    public List<PayPal> selectPayPalList(PayPal record);
}