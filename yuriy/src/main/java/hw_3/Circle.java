package hw_3;

public class Circle extends Square {

    Circle() {

    }

    Circle(int radiusR) {

        this.radiusR = radiusR;
    }

    public String areaCalc() {
        return "Circle S = " + pNumber * (radiusR * radiusR);
    }
}
