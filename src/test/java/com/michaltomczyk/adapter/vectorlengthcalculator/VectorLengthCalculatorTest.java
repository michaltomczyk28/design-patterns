package com.michaltomczyk.adapter.vectorlengthcalculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class VectorLengthCalculatorTest {
    private VectorLengthCalculator calculator;

    @BeforeEach
    public void setUp() {
        this.calculator = new VectorLengthCalculator();
    }

    @Test
    public void shouldCountLengthOfVector3() {
        Vector3 vector3 = new Vector3Imp(2, 4, 4);

        double length = this.calculator.countLength(vector3);
        Assertions.assertEquals(6, length);
    }

    @Test
    public void shouldCountLengthOfVector2Vector3Adapter() {
        Vector2 vector2 = new Vector2Imp(3, 4);
        Vector2Vector3Adapter adapter = new Vector2Vector3Adapter(vector2);

        double length = this.calculator.countLength(adapter);
        Assertions.assertEquals(5, length);
    }
}
