package com.web.service;

import java.util.List;


import com.web.pojo.PayPal;

public interface PayPalService {
   
	public int deletePayPal(Integer paypalid);

   
    public  int addPayPal(PayPal record);

  
    public PayPal findByPassengerId(Integer passengerid);

   
    public  int editPayPal(PayPal record);

    
    public List<PayPal> viewList(PayPal record);
}