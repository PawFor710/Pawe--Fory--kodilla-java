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
        shapes.add(circle);
    }
    public int getShapesQuantity() {
        return shapes.size();
    }
    public Shape getFigure(int n) {
        n = 0;
        shapes.get(n);

        return shapes.get(n);
    }
    public void removeFigure(Shape shape) {
        shapes.remove(square);
    }

    public String showFigures() {
        return square.getName() + " " + circle.getName() + " " + triangle.getName();
    }
}
