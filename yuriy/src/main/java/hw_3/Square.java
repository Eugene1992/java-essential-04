package hw_3;

/**
 * Created by shast on 7/28/2016.
 */
public class Square extends Rectangle {
    Square(){}
    Square(int a) {
        this.a = a;
    }
    public String areCalculate() {
        return "Square S = " +  a * a;
    }
}
