package com.michaltomczyk.factorymethod.wallet;

import java.util.ArrayList;

public abstract class Wallet {
    private ArrayList<Money> money = new ArrayList<>();

    public void addMoney(int count) {
        for(int i = 0; i < count; i++){
            money.add(createMoney());
        }
    }

    public String displayMoney() {
        return money.size() + money.get(0).getCurrency();
    }

    protected abstract Money createMoney();
}
