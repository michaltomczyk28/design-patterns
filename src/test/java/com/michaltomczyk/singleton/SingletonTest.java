package com.michaltomczyk.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SingletonTest {
    @Test
    public void shouldCreateOnlyOneInstanceOfASingletonClass(){
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        Assertions.assertSame(singleton1, singleton2);
    }
}
