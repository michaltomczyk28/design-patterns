package com.michaltomczyk.factorymethod.wallet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WalletTest {
    @Test
    public void shouldAddMoneyToUsdWallet() {
        Wallet wallet = new UsdWallet();

        wallet.addMoney(10);
        Assertions.assertEquals("10$", wallet.displayMoney());

        wallet.addMoney(10);
        Assertions.assertEquals("20$", wallet.displayMoney());
    }

    @Test
    public void shouldAddMoneyToPlnWallet() {
        Wallet wallet = new PlnWallet();

        wallet.addMoney(10);
        Assertions.assertEquals("10zł", wallet.displayMoney());

        wallet.addMoney(10);
        Assertions.assertEquals("20zł", wallet.displayMoney());
    }
}
