package hw_3;

public class Square extends Rectangle {

    Square() {

    }

    Square(int sideA) {
        this.sideA = sideA;
    }

    public String areaCalc() {
        return "Square S = " + sideA * sideA;
    }
}
