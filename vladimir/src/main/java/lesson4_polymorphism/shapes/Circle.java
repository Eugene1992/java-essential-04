package lesson4_polymorphism.shapes;

/**
 * Describes Circle
 */
public class Circle extends Shape {

    private double radius = 0;

    Circle(double radius){
        setRadius(radius);
    }

    public void setRadius(double radius) {
        if(radius > 0) {
            this.radius = radius;
        }
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getSquare() {
        return Math.PI * Math.pow(radius, 2);
    }
}
