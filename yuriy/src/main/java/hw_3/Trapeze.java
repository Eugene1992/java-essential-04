package hw_3;

public class Trapeze extends Parallelogram {

    Trapeze(int sideA, int sideB, int height) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
    }


    public String areaCalc() {
        return "Trapeze S = " + ((sideA + sideB) / 2) * height;
    }
}
