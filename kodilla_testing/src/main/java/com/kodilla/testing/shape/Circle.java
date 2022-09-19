package com.kodilla.testing.shape;

public class Circle implements Shape{
    private double radius;
    private double field;

    public Circle(double radius) {
        this.radius = radius;
        this.field = radius * radius * 3.14;
    }

    @Override
    public String getShapeName() {
        return "Circle ";
    }

    @Override
    public double getField() {
        return field;
    }
}
