package lesson4_polymorphism.shapes;

/**
 * Describes rectangle
 */
public class Rectangle extends Shape {
    private double sideA = 0;
    private double sideB = 0;

    Rectangle(double a, double b){
        setSideA(a);
        setSideB(b);
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

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    @Override
    public double getSquare() {
        return sideA*sideB;
    }
}
