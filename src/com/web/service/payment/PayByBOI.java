package com.web.service.payment;

import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component("PayByBOI")
public class PayByBOI implements IPaymentMethod {
//HttpServletRequest request, HttpServletResponse response
    @Override
    public String pay() {
    	return "Pay done from BOI";
    }
//HttpServletRequest request, HttpServletResponse response
    @Override
    public boolean refund() {
        return false;
    }
}
