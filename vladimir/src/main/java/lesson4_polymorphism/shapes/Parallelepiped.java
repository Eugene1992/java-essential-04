package lesson4_polymorphism.shapes;

/**
 * Created by main_ on 28.07.2016.
 */
public class Parallelepiped extends Shape {
    private double sideA = -1;
    private double sideB = -1;
    private double height = -1;
    private int gamma = -1;

    public Parallelepiped(double sideA, double height){
        setSideA(sideA);
        setHeight(height);
    }

    public Parallelepiped(double sideA, double sideB, int gamma){
        setSideA(sideA);
        setSideB(sideB);
        setGamma(gamma);
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

    public void setGamma(int gamma) {
        if(gamma > 0) {
            this.gamma = gamma;
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

    public int getGamma() {
        return gamma;
    }

    @Override
    public double getSquare() {
        if(sideA != -1 && height != -1){
            return sideA * height;
        } else if(sideA != -1 && sideB != -1 && gamma != -1){
            return sideA * sideB * Math.sin(gamma);
        }

        return -1; //we can throw exception here
    }
}
