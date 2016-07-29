package hw_3;

public class Parallelogram extends Square {
    Parallelogram() {
    }

    Parallelogram(int a, int b, int h, int gamma) {
        this.a = a;
        this.b = b;
        this.h = h;
        this.gamma = gamma;
    }
    public String areCalculate() {
        return "Parralelogram S = " + a * h + "\n" + "     S = a*b*SinGamma = " + (a * b) * Math.sin(Math.toRadians(gamma));
    }
}
