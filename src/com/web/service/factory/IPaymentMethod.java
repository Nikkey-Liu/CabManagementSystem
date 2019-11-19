package com.web.service.factory;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface IPaymentMethod {

    public String pay(HttpServletRequest request, HttpServletResponse response);

    public boolean refund(HttpServletRequest request, HttpServletResponse response);
}
