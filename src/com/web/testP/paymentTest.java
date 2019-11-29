package com.web.testP;

import org.junit.Test;

import com.web.service.payment.MyPaymentMethodFactory;
import com.web.service.payment.PaypalFactoryImpl;

public class paymentTest {
	@Test
	 public void test01() {
	
		
MyPaymentMethodFactory myPaymentMethodFactory = new  PaypalFactoryImpl();
System.out.println(myPaymentMethodFactory.getPaymentApproach().pay());


     
	}
}
