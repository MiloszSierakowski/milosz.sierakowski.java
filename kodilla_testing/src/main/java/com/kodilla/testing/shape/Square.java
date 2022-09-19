package com.kodilla.testing.shape;

public class Square implements Shape {

    private double sideOfTheSquare;
    private double field;

    public Square(double sideOfTheSquare) {
        this.sideOfTheSquare = sideOfTheSquare;
        this.field = sideOfTheSquare*sideOfTheSquare;
    }

    @Override
    public String getShapeName() {
        return "Square ";
    }

    @Override
    public double getField() {
        return field;
    }
}
