package com.michaltomczyk.factorymethod.wallet;

public class UsdWallet extends Wallet {
    @Override
    protected Money createMoney() {
        return new UsdMoney();
    }
}
