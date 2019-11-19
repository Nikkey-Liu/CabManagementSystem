package com.web.service.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MyPaymentMethodFactoryImpl implements MyPaymentMethodFactory{
    @Autowired
    @Qualifier("PayByPayPal")
    IPaymentMethod payByPayPal;
    @Autowired
    @Qualifier("PayByBOI")
    IPaymentMethod payByBOI;
    @Autowired
    @Qualifier("PayByCurrencyFair")
    IPaymentMethod payByCurrencyFair;

    public static final int ByPayPal = 1;
    public static final int ByBOI = 2;
    public static final int ByCurrencyFair = 3;

    public IPaymentMethod getPaymentApproach(int payment) {
        switch (payment) {
            case ByBOI:
                return payByBOI;
            case ByPayPal:
                return payByPayPal;
            case ByCurrencyFair:
                return payByCurrencyFair;
        }
        return null;
    }
}
