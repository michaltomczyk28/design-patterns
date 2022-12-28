package com.michaltomczyk.adapter.vectorlengthcalculator;

public class Vector2Imp implements Vector2{
    private final double x;
    private final double y;

    public Vector2Imp(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
