package com.michaltomczyk.factorymethod.wallet;

public class UsdMoney extends Money {
    @Override
    public String getCurrency() {
        return "$";
    }
}
