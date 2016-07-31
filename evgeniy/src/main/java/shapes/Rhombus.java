package com.shapes;

public class Rhombus extends Shape {

    private int a;
    private int corner;

    public Rhombus(int a, int corner) {
        this.a = a;
        this.corner = corner;
    }

    @Override
    public double getSquer() {
        return a * a * Math.sin(corner);
    }
}
