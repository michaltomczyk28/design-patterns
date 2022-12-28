package com.michaltomczyk.adapter.vectorlengthcalculator;

public class VectorLengthCalculator {
    public double countLength(Vector3 vector3) {
        double x = vector3.getX();
        double y = vector3.getY();
        double z = vector3.getZ();

        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2 ));
    }
}
