package com.michaltomczyk.decorator.text;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SimpleTextSourceTest {
    private TextSource textSource;

    @BeforeEach
    public void setUp(){
        textSource = new SimpleTextSource();
    }

    @Test
    public void shouldWriteIdentity(){
        String actual = textSource.write("sample");
        Assertions.assertEquals("sample", actual);
    }

    @Test
    public void shouldReadIdentity(){
        textSource.write("sample");
        Assertions.assertEquals("sample", textSource.read());
    }
}
