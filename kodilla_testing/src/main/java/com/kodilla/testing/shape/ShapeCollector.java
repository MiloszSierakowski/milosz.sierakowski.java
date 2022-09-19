package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private List<Shape> shapesList = new ArrayList<>();


    public void addFigure(Shape shape) {
        shapesList.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if (shapesList.contains(shape)) {
            shapesList.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int n) {
        if (n >= 0 && n < shapesList.size()) {
           return shapesList.get(n);
        }
        return null;
    }

    public String showFigure() {
        String listOfFigures = "";
        for (int i =0 ; i<shapesList.size();i++){
            listOfFigures += shapesList.get(i).getShapeName();
        }
        return listOfFigures;
    }

    public int getShapeQuantity() {
        return shapesList.size();
    }
}
