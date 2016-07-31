package hw_3;

public class Rectangle extends Figure {

    Rectangle(int sideOne, int sideTwo) {

        this.sideOne = sideOne;
        this.sideTwo = sideTwo;

    }

    public String calculate() {

        return "Rectangle:" + "\n" + "S = " + sideOne * sideTwo;

    }
}
