package hw_3;

public class Parallelogram extends Figure {

    Parallelogram(int sideOne, int sideTwo, int height, int gamma) {
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.height = height;
        this.gamma = gamma;
    }
    public String calculate() {

        return "Parralelogram:" + "\n" + "S = " + sideOne * height + "\n" + "S = sideOne*sideTwo*SinGamma = " + (sideOne * sideTwo) * Math.sin(Math.toRadians(gamma));

    }
}
