package com.kodilla.testing.shape;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;


public class ShapeCollectorTestSuite {
    private ShapeCollector shapeCollector;
    private Shape square;

    @BeforeAll
    void setUp() {
        shapeCollector = new ShapeCollector();
        square = new Square();
    }

    @Test
    void testAddFigure() {
        shapeCollector.addFigure(square);
        assertEquals(1, shapeCollector.getPostsQuantity());
    }

    @Test
    void testRemoveFigureNotExisting() {
        boolean result = shapeCollector.removeFigure(square);
        assertFalse(result);
    }

    @Test
    void testRemoveFigure() {
        shapeCollector.addFigure(square);
        boolean result = shapeCollector.removeFigure(square);
        assertTrue(result);
        assertEquals(0, shapeCollector.getPostsQuantity());

    }

    @Test
    void testGetFigure() {
        shapeCollector.addFigure(square);
        Shape retrievedFigure = shapeCollector.getFigure(0);
        assertEquals(square,retrievedFigure);
    }

    @Test
    void testShowFigure() {
        Shape circle = new Circle();
        Shape triangle = new Triangle();
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(triangle);
        String retrievedFiguresNames = "Square Circle Triangle";
        assertEquals(shapeCollector.showFigure(),retrievedFiguresNames);
    }
}
