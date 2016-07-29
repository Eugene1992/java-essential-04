package hw_3;

public class Triangle extends Square {
    Triangle() {
    }

    Triangle(int a, int h) {
        this.a = a;
        this.h = h;
    } public String areCalculate() {
        return "Triangle S = " + (a * h) / 2 + "\n";
    }
}
