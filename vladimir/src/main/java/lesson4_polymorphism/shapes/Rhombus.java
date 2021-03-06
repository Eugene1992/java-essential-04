package lesson4_polymorphism.shapes;

/**
 * Describes rhombus
 */
public class Rhombus extends Shape {
    private double sideA = -1;
    private double alpha = -1;
    private double height = -1;


    public void setSideA(double sideA) {
        if(sideA > 0) {
            this.sideA = sideA;
        }
    }

    public void setAlpha(double alpha) {
        if(alpha >= 0 && alpha <= 360) {
            this.alpha = Math.toRadians(alpha);
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

    public double getAlpha() {
        return alpha;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getSquare() {
        if(sideA != -1 && height != -1){
            return sideA * height;
        } else if(sideA != -1 && alpha != -1){
            return Math.pow(sideA, 2) * Math.sin(alpha);
        }

        return -1;//we can throw error here
    }
}
