package com.michaltomczyk.factorymethod.wallet;

public class PlnMoney extends Money {
    @Override
    public String getCurrency() {
        return "zł";
    }
}
