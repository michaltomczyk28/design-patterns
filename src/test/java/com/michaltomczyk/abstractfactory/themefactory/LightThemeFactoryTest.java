package com.michaltomczyk.abstractfactory.themefactory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LightThemeFactoryTest {
    private ThemeFactory themeFactory;

    @BeforeEach
    public void setUp(){
        themeFactory = new LightThemeFactory();
    }

    @Test
    public void shouldCreateLightButton(){
        Button b = themeFactory.createButton();
        Assertions.assertEquals("Light button", b.getDescription());
    }

    @Test
    public void shouldCreateLightDialog(){
        Dialog d = themeFactory.createDialog();
        Assertions.assertEquals("Light dialog", d.getDescription());
    }
}
