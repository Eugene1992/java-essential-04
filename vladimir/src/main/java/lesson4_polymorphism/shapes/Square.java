package lesson4_polymorphism.shapes;

/**
 * Describes Square
 */
public class Square extends Shape {
    private double side = 0;

    public Square(double side){
        setSide(side);
    }


    public void setSide(double side) {
        if(side > 0) {
            this.side = side;
        }
    }

    public double getSide() {
        return side;
    }

    @Override
    public double getSquare() {
        return Math.pow(side, 2);
    }
}
