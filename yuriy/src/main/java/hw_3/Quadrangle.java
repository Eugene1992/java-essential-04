package hw_3;

/**
 * Created by shast on 7/28/2016.
 */
public class Quadrangle extends MainShape {
    Quadrangle(int a, int h, int b, double Siny){
        this.a = a;
        this.Siny = Siny;
        this.h = h;
        this.b = b;
    }
    public String areCalculate() {
        return "Quadrangle S = " + a * h +"\n" + "           S = a*b*Siny = " + a * b * Siny;
    }
}
