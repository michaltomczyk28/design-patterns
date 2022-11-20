package com.michaltomczyk.abstractfactory.themefactory;

public class DarkThemeFactory extends ThemeFactory {
    @Override
    public Button createButton() {
        return new DarkButton();
    }

    @Override
    public Dialog createDialog() {
        return new DarkDialog();
    }
}
