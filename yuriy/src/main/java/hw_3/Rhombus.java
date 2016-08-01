package hw_3;

public class Rhombus extends Circle {
    Rhombus() {
    }

    Rhombus(int sinA, int sideA, int height) {
        this.sinA = sinA;
        this.sideA = sideA;
        this.height = height;
    }

    public String areaCalc() {
        return "Rhombus S = a^2*Sinα = " + (sideA * sideA) * Math.sin(Math.toRadians(sinA)) + "\n" + "S = a*h = " + sideA * height;
    }
}
