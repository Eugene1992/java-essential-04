package hw_3;

/**
 * Created by shast on 7/28/2016.
 */

public class Rhombus extends Circle {
    Rhombus(){}
    Rhombus(int Sina, int a, int h){
        this.Sina = Sina;
        this.a = a;
        this.h = h;
    }
    public String areCalculate() {
        return "Rhombus S = a^2*Sinα = " + (a * a) * Math.sin(Math.toRadians(Sina)) +"\n" + "        S = a*h = " + a * h;
    }
}
