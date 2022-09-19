package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private double baseOfTheTriangle;
    private double heightOfTheTriangle;
    private double field;

    public Triangle(double baseOfTheTriangle, double heightOfTheTriangle) {
        this.baseOfTheTriangle = baseOfTheTriangle;
        this.heightOfTheTriangle = heightOfTheTriangle;
        this.field = baseOfTheTriangle * heightOfTheTriangle / 2;
    }

    @Override
    public String getShapeName() {
        return "Triangle ";
    }

    @Override
    public double getField() {
        return field;
    }
}
