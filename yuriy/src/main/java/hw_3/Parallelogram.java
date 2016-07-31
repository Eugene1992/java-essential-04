package hw_3;

public class Parallelogram extends Triangle {
    Parallelogram() {
    }

    Parallelogram(int sinY, int sideA, int height, int sideB) {
        this.sinY = sinY;
        this.sideA = sideA;
        this.height = height;
        this.sideB = sideB;
    }

    public String areaCalc() {
        return "Parallelogram S = " + sideA * height + "\n" + "S = a*b*Siny = " + (sideA * sideB) * Math.sin(Math.toRadians(sinY));
    }
}
