package com.michaltomczyk.state.payment;

public class ProcessingPaymentState implements IPaymentState {
    @Override
    public boolean canPay() {
        return false;
    }

    @Override
    public void pay(PaymentManager paymentManager) {
        throw new RuntimeException("Cannot pay in a processing state.");
    }
}
