package com.shapes;

public class Parallelogram extends Shape{

    int a;
    int h;

    public Parallelogram(int a, int h) {
        this.a = a;
        this.h = h;
    }

    @Override
    public double getSquer() {
        return a * h;
    }
}