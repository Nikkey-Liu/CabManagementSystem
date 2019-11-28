package com.web.service.payment;

public class BOIFactoryImpl  implements MyPaymentMethodFactory{

	@Override
	public IPaymentMethod getPaymentApproach() {
		return new PayByBOI();
	}
	

}
