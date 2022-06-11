package com.kodilla.testing.shape;

import java.util.Objects;

public class Triangle implements Shape {

    private String name;
    private double length;
    private double height;
    private double resultOfField = (length * height)/2;

    public Triangle(String name, double resultOfField) {
        this.name = name;
        this.resultOfField = resultOfField;
    }
    public String getName() {
        return name;
    }
    public double getLength() {
        return length;
    }
    public double getHeight() {
        return height;
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
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.length, length) == 0 && Double.compare(triangle.height, height) == 0 && Double.compare(triangle.resultOfField, resultOfField) == 0 && Objects.equals(name, triangle.name);
    }

    @Override
    public int hashCode() {
        return 10 * name.hashCode();
    }
}
