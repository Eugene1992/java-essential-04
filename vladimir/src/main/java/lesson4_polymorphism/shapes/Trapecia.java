package lesson4_polymorphism.shapes;

/**
 * Created by main_ on 28.07.2016.
 */
public class Trapecia extends Shape {
    private double sideA = 0;
    private double sideB = 0;
    private double height = 0;

    Trapecia(double sideA, double sideB, double height){
        setSideA(sideA);
        setSideB(sideB);
        setHeight(height);
    }

    public void setSideA(double sideA) {
        if(sideA > 0) {
            this.sideA = sideA;
        }
    }

    public void setSideB(double sideB) {
        if(sideB > 0) {
            this.sideB = sideB;
        }
    }

    public void setHeight(double height) {
        if(height > 0) {
            this.height = height;
        }
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getSquare() {
        return (sideA+sideB)/2 * height;
    }
}
