package com.web.service.payment;


import com.web.dao.PayPalMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Component("PayByPayPal")
public class PayByPayPal implements IPaymentMethod {

    @Autowired
    private PayPalMapper payPalMapper;
       //HttpServletRequest request, HttpServletResponse response
    @Override
    public String pay() {
      return "Pay done from Paypal";
		
    }
//HttpServletRequest request, HttpServletResponse response
    @Override
    public boolean refund() {
        return false;
    }
}
