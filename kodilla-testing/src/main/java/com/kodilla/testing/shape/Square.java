package com.kodilla.testing.shape;

import java.util.Objects;

public class Square implements Shape {

    private double length;
    private double height;
    private String name;
    private double resultOfField = length * height;

    public Square(String name, double resultOfField) {
        this.name = name;
        this.resultOfField = resultOfField;
    }

    public double getLength() {
        return length;
    }

    public double getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }

    public double getResultOfField() {
        return resultOfField;
    }

    @Override
    public String getShapeName() {
        //temporary no name
        return "";
    }
    @Override
    public double getField() {
        //temporary value 10
        return 10;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return Double.compare(square.length, length) == 0 && Double.compare(square.height, height) == 0 && Double.compare(square.resultOfField, resultOfField) == 0 && Objects.equals(name, square.name);
    }
    @Override
    public int hashCode() {
        return 10 * name.hashCode();
    }
}
