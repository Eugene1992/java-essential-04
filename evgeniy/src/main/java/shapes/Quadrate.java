package com.shapes;

public class Quadrate extends Shape {

    private int a;

    public Quadrate(int a) {
        this.a = a;
    }

    @Override
    public double getSquer() {
        return a*a;
    }
}