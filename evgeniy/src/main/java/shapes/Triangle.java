package com.shapes;

public class Triangle extends Shape {

    private int h;
    private int a;

    public Triangle(int h, int a) {
        this.h = h;
        this.a = a;
    }

    @Override
    public double getSquer() {
        return (a * h) / 2;
    }
}
