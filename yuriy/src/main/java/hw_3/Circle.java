package hw_3;

/**
 * Created by shast on 7/28/2016.
 */
public class Circle extends MainShape {
    Circle(int R){
        this.R = R;
    }
    public String areCalculate() {
        return "Circle S = " + (P * (R * R)) / R;
    }
}
