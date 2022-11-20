package com.michaltomczyk.factorymethod.wallet;

public class PlnWallet extends Wallet {
    @Override
    protected Money createMoney() {
        return new PlnMoney();
    }
}
