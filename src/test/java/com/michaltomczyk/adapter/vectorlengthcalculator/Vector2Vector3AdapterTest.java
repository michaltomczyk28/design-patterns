package com.michaltomczyk.adapter.vectorlengthcalculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Vector2Vector3AdapterTest {
    @Test
    public void shouldConvertVector2ToVector3() {
        Vector2 vector2 = new Vector2Imp(3, 4);
        Vector2Vector3Adapter adapter = new Vector2Vector3Adapter(vector2);

        Assertions.assertTrue(adapter instanceof Vector3);

        Assertions.assertEquals(3, adapter.getX());
        Assertions.assertEquals(4, adapter.getY());
        Assertions.assertEquals(0, adapter.getZ());
    }
}
