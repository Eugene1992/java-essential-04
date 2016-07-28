package hw_3;

/**
 * Created by shast on 7/28/2016.
 */
public class Quadrangle extends Pyramid {
    Quadrangle(){}
    Quadrangle(int Siny, int a, int h, int b){
        this.Siny = Siny;
        this.a = a;
        this.h = h;
        this.b = b;
    }
    public String areCalculate() {
        return "Quadrangle S = " + a * h +"\n" + "           S = a*b*Siny = " + (a * b) * Math.sin(Math.toRadians(Siny));
    }
}
