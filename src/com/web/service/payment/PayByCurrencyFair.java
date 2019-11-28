package com.web.service.payment;

import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component("PayByCurrencyFair")
public class PayByCurrencyFair implements IPaymentMethod {
//HttpServletRequest request, HttpServletResponse response
    @Override
    public String pay() {
    	return "Payment done by cash";
    }

    @Override
    public boolean refund() {
        return false;
    }
}
