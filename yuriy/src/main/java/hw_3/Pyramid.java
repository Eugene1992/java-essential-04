package hw_3;

/**
 * Created by shast on 7/28/2016.
 */
public class Pyramid extends Shape {
    Pyramid(int a, int h){
        this.a = a;
        this.h = h;
    }
    public String areCalculate() {
        return "Pyramid S = " + 0.5 * (a * h);
    }
}
