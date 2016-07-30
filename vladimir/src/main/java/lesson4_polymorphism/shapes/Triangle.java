package lesson4_polymorphism.shapes;

/**
 * Describes shape
 */
public class Triangle extends Shape {
    private double side = 0;
    private double height = 0;

    Triangle(double side, double height){
        setSide(side);
        setHeight(height);
    }

    public void setHeight(double height) {
        if(height > 0) {
            this.height = height;
        }
    }

    public void setSide(double side) {
        if(side > 0) {
            this.side = side;
        }
    }

    public double getSide() {
        return side;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getSquare() {
        return 0.5 * side * height;
    }
}
