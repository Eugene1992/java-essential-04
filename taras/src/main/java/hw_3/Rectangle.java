package hw_3;

/**
 * Created by Тарас on 28.07.2016.
 */
public class Rectangle extends Square {
    Rectangle() {
    }

    Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public String areCalculate() {
        return "Rectangle S = " + a * b + "\n";
    }
}
