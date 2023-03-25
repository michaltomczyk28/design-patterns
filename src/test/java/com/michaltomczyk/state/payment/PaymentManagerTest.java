package com.michaltomczyk.state.payment;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PaymentManagerTest {
    @Test
    public void canPayInAnOpenState() {
        PaymentManager paymentManager = new PaymentManager();
        paymentManager.setState(new OpenPaymentState());

        boolean result = paymentManager.canPay();

        Assertions.assertTrue(result);
    }

    @Test
    public void cannotPayInProcessingState() {
        PaymentManager paymentManager = new PaymentManager();
        paymentManager.setState(new ProcessingPaymentState());

        boolean result = paymentManager.canPay();

        Assertions.assertFalse(result);
    }

    @Test
    public void cannotPayAgainUntilLastPaymentIsProcessed() {
        PaymentManager paymentManager = new PaymentManager();
        paymentManager.setState(new OpenPaymentState());

        paymentManager.pay();
        boolean result = paymentManager.canPay();

        Assertions.assertFalse(result);
    }
}
