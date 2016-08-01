package com.shapes;

public class Circle extends Shape {

    private int r;

    public Circle(int r) {
        this.r = r;
    }

    @Override
    public double getSquer() {
        return Math.PI * r * r;
    }
}