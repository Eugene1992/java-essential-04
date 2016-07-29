package hw_3;

public abstract class Square {
    public int a;
    public int b;
    public int h;
    public int alpha;
    public int gamma;
    public int s;


    public String toString() {
        return "Square: " + s;
    }

    Square() {
    }

    Square(int a, int b, int h, int alpha, int gamma, int s) {
        this.a = a;
        this.b = b;
        this.h = h;
        this.alpha = alpha;
        this.gamma = gamma;
        this.s = s;

   /* }
    public int getA() {

        return a;
    }
    public int getB() {

        return b;
    }
    public int getH() {

        return h;
    }
    public int getAlpha()
    {
        return alpha;
    }
    public int getGamma() {

        return gamma;
    }
    public int s() {
        return s;
    }
}
*/
    }
}