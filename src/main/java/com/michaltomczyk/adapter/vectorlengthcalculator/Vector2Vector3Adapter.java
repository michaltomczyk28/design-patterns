package com.michaltomczyk.adapter.vectorlengthcalculator;

public class Vector2Vector3Adapter implements Vector3 {
    private final Vector2 vector2;

    public Vector2Vector3Adapter(Vector2 vector2) {
        this.vector2 = vector2;
    }

    @Override
    public double getX() {
        return this.vector2.getX();
    }

    @Override
    public double getY() {
        return this.vector2.getY();
    }

    @Override
    public double getZ() {
        return 0;
    }
}
