package hw_3;

public class Triangle extends Figure {

    Triangle(int sideOne, int height) {

        this.sideOne = sideOne;
        this.height = height;

    }

    public String calculate() {

        return "Triangle:" + "\n" + "S = " + (sideOne * height) / 2;

    }
}
