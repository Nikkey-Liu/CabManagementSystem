package com.web.service.payment;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.web.pojo.PayPal;
import com.web.service.PayPalService;

public class testPayment {
	
	 
	@Test
	 public void test01() {
	
		
MyPaymentMethodFactory myPaymentMethodFactory = new  PaypalFactoryImpl();
System.out.println(myPaymentMethodFactory.getPaymentApproach().pay());


      
	}
}
