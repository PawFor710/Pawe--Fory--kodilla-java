package com.kodilla.testing.shape;

import java.util.Objects;

public class Circle implements Shape {

    private String name;
    private double length;
    private double resultOfField = 3.14 * (length/2) * (length/2);

    public Circle(String name, double resultOfField) {
        this.name = name;
        this.resultOfField = resultOfField;
    }
    public String getName() {
        return name;
    }
    public double isLength() {
        return length;
    }
    public double isResultOfField() {
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
        Circle circle = (Circle) o;
        return Double.compare(circle.length, length) == 0 && Double.compare(circle.resultOfField, resultOfField) == 0 && Objects.equals(name, circle.name);
    }
    @Override
    public int hashCode() {
        return 10 * name.hashCode();
    }
}
