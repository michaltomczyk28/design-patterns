package com.michaltomczyk.state.payment;

public class PaymentManager {
    private IPaymentState state;

    public void setState(IPaymentState state) {
        this.state = state;
    }

    public boolean canPay() {
        return this.state.canPay();
    }

    public void pay() {
        this.state.pay(this);
    }
}
