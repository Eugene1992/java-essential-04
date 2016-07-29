package hw_3;

public class Trapeze extends Square {
    Trapeze() {
    }

    Trapeze(int a, int b, int h) {
        this.a = a;
        this.b = b;
        this.h = h;
    }
    public String areCalculate() {
        return "Trapeze S = " + ((a + b) / 2) * h + "\n";
    }
}
