package com.michaltomczyk.decorator.text;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CaesarCipherDecoratorTest {
    TextSource textSource;

    @BeforeEach
    public void setUp(){
       textSource = new CaesarCipherDecorator(new SimpleTextSource());
    }

    @Test
    public void shouldApplyCaesarCipherOnWrite(){
        String actual = textSource.write("abc");
        Assertions.assertEquals("def", actual);
    }

    @Test
    public void shouldDecodeCaesarCipherOnRead(){
        textSource.write("abc");
        Assertions.assertEquals("abc", textSource.read());
    }
}
