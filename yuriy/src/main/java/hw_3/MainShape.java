package hw_3;

/**
 * Created by shast on 7/28/2016.
 */
    abstract public class MainShape {
    double S, P = 3.14;
    int a, b, R, h, Sina, Siny;
    MainShape(){}
    MainShape(double S, double P, int Siny, int Sina, int a, int b, int R, int h){
        this.S = S;
        this.P = P;
        this.Siny = Siny;
        this.Sina = Sina;
        this.a = a;
        this.b = b;
        this.R = R;
        this.h = h;
    }
    public String areCalculate(){
        return "Визначаємо площі фігур";
    }
    public static void main(String[] args) {
        Rectangle r = new Rectangle(5, 5);
        Square s = new Square(2);
        Circle c = new Circle(4);
        Rhombus rh = new Rhombus(130, 2, 3);
        Pyramid p = new Pyramid(2, 2);
        Quadrangle q = new Quadrangle(60, 2, 3, 4);
        QuadrangleSecond qs = new QuadrangleSecond(2, 3, 4);
        System.out.println(r.areCalculate());
        System.out.println(s.areCalculate());
        System.out.println(c.areCalculate());
        System.out.println(rh.areCalculate());
        System.out.println(p.areCalculate());
        System.out.println(q.areCalculate());
        System.out.println(qs.areCalculate());
    }
}
