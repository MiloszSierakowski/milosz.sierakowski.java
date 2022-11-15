package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPING = "Shopping";
    public static final String PAINTING = "Painting";
    public static final String DRIVING = "Driving";

    public final Task makeTask(final String shapeClass) {
        return switch (shapeClass) {
            case SHOPPING -> new ShoppingTask("Quick shopping", "Sugar",1.5);
            case PAINTING -> new PaintingTask("Wall painting", "Green","Living room");
            case DRIVING -> new DrivingTask("Travel to Poland", "Poland", "Plane");
            default -> null;
        };
    }

}
