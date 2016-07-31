package hw_3;

public class Rectangle extends MainShape {
    Rectangle() {
    }

    Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public String areaCalc() {
        return "Rectangle S = " + sideA * sideB;
    }
}
