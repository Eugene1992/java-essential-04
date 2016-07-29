package hw_3;

public class Quadrate extends Square {

    Quadrate() {
    }

    Quadrate(int a) {
        this.a = a;
    }

    public String areCalculate() {
        return "Quadrate S = " + a * a + "\n";
    }
}
