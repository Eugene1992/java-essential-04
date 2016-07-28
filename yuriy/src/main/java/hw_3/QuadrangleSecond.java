package hw_3;

/**
 * Created by shast on 7/28/2016.
 */
public class QuadrangleSecond extends Quadrangle {
    QuadrangleSecond(){}
    QuadrangleSecond(int a, int b, int h){
        this.a = a;
        this.b = b;
        this.h = h;
    }
    public String areCalculate() {
        return "QuadrangleSecond S = " + ((a + b) / 2) * h;
    }
}
