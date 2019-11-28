package com.web.service.payment;

public class CurrencyfairFacrtoryImpl implements MyPaymentMethodFactory{

	@Override
	public IPaymentMethod getPaymentApproach() {
		return new PayByCurrencyFair();
	}
	

}
