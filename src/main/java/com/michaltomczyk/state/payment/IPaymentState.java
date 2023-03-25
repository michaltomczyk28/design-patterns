package com.michaltomczyk.state.payment;

public interface IPaymentState {
    boolean canPay();

    void pay(PaymentManager paymentManager);
}
