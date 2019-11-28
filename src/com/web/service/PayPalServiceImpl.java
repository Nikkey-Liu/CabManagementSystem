package com.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.web.dao.DriverMapper;
import com.web.dao.VehicleMapper;
import com.web.pojo.PayPal;
import com.web.service.payment.MyPaymentMethodFactory;
@Service("payPalService")
@Transactional
public class PayPalServiceImpl implements PayPalService {
	@Autowired
	MyPaymentMethodFactory myPaymentMethodFactory;
	
	@Override
	public int deletePayPal(Integer paypalid) {
	
		return 0;
	}

	@Override
	public int addPayPal(PayPal record) {
		
			
		return 0;
	}

	@Override
	public PayPal findByPassengerId(Integer passengerid) {
	
		return null;
	}

	@Override
	public int editPayPal(PayPal record) {
	
		return 0;
	}

	@Override
	public List<PayPal> viewList(PayPal record) {
		
		return null;
	}

}
