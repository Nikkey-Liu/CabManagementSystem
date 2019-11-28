package com.web.service.payment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PaypalFactoryImpl implements MyPaymentMethodFactory{

	@Override
	public IPaymentMethod getPaymentApproach() {
		return new PayByPayPal();
	}
}
