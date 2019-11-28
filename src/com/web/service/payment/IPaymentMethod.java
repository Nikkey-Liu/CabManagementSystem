package com.web.service.payment;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface IPaymentMethod {
//HttpServletRequest request, HttpServletResponse response
    public String pay();
//HttpServletRequest request, HttpServletResponse response
    public boolean refund();
}
