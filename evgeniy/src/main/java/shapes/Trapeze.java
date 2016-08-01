package com.shapes;


public class Trapeze extends Shape {

    int a;
    int b;
    int h;

    public Trapeze(int a, int b, int h) {
        this.a = a;
        this.b = b;
        this.h = h;

    }

    @Override
    public double getSquer() {
        return ((a + b) / 2) * h;
    }
}