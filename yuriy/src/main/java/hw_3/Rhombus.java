package hw_3;

/**
 * Created by shast on 7/28/2016.
 */
public class Rhombus extends Shape {
    Rhombus(double Sina, int a,  int h){
        this.a = a;
        this.Sina = Sina;
        this.h = h;
    }

    public String areCalculate() {
        return "Rhombus S = a^2*Sinα = " + (a * a) * Sina +"\n" + "        S = a*h = " + a * h;
    }
}
