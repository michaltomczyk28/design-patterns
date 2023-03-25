package com.michaltomczyk.state.payment;

public class OpenPaymentState implements IPaymentState {
    @Override
    public boolean canPay() {
        return true;
    }

    @Override
    public void pay(PaymentManager paymentManager) {
        paymentManager.setState(new ProcessingPaymentState());
    }
}
