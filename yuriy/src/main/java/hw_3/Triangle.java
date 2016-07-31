package hw_3;

public class Triangle extends Rhombus {

    Triangle() {

    }

    Triangle(int sideA, int height) {
        this.sideA = sideA;
        this.height = height;
    }

    public String areaCalc() {
        return "Triangle S = " + 0.5 * (sideA * height);
    }
}
