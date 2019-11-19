package com.web.service.factory;

import org.springframework.beans.TypeMismatchException;
import org.springframework.core.convert.converter.Converter;

public class PaymentMethodConverter implements Converter<String, Integer> {
    @Override
    public Integer convert(String source) {
        if ("paypal".equals(source)) {
            return MyPaymentMethodFactoryImpl.ByPayPal;
        } else if ("alipay".equals(source)) {
            return MyPaymentMethodFactoryImpl.ByBOI;
        } else if ("currencyfair".equals(source)) {
            return MyPaymentMethodFactoryImpl.ByCurrencyFair;
        } else {
            throw new TypeMismatchException(source, Integer.class);
        }
    }


}
