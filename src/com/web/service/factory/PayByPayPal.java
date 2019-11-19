package com.web.service.factory;


import com.web.dao.PayPalMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Component("PayByPayPal")
public class PayByPayPal implements IPaymentMethod {

    @Autowired
    private PayPalMapper payPalMapper;

    @Override
    public String pay(HttpServletRequest request, HttpServletResponse response) {
        return null;
    }

    @Override
    public boolean refund(HttpServletRequest request, HttpServletResponse response) {
        return false;
    }
}
