package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private List<Shape> shapes = new ArrayList<>();
    Square square = new Square("Square", 4.00);
    Circle circle = new Circle("Circle", 12.56);
    Triangle triangle = new Triangle("Triangle", 4.00);
    public void addFigure(Shape shape) {
        shapes.add(square);
    }
    public int getShapesQuantity() {
        return shapes.size();
    }
    public void removeFigure(Shape shape) {
        shapes.remove(square);
    }
    public Shape getFigure(int n) {
        return shapes.get(0);
    }
    public String showFigures() {
        return square.getName() + " " + circle.getName() + " " + triangle.getName();
    }
}
