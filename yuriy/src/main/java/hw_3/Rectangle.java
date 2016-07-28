package hw_3;

/**
 * Created by shast on 7/28/2016.
 */
public class Rectangle extends MainShape {
    Rectangle(){}
    Rectangle(int a, int b){
        this.a = a;
        this.b = b;
    }
    public String areCalculate(){
        return "Rectangle S = " + a * b;
    }
}
