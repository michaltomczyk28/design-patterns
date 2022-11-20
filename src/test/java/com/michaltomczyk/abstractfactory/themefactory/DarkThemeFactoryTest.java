package com.michaltomczyk.abstractfactory.themefactory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DarkThemeFactoryTest {
    private ThemeFactory themeFactory;

    @BeforeEach
    public void setUp(){
        themeFactory = new DarkThemeFactory();
    }

    @Test
    public void shouldCreateLightButton(){
        Button b = themeFactory.createButton();
        Assertions.assertEquals("Dark button", b.getDescription());
    }

    @Test
    public void shouldCreateLightDialog(){
        Dialog d = themeFactory.createDialog();
        Assertions.assertEquals("Dark dialog", d.getDescription());
    }
}
