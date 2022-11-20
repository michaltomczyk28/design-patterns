package com.michaltomczyk.abstractfactory.themefactory;

public class LightThemeFactory extends ThemeFactory {
    @Override
    public Button createButton() {
        return new LightButton();
    }

    @Override
    public Dialog createDialog() {
        return new LightDialog();
    }
}
