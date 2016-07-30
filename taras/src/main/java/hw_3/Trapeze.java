package hw_3;

public class Trapeze extends Figure {

    Trapeze(int sideOne, int sideTwo, int height) {

        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.height = height;

    }

    public String calculate() {

        return "Trapeze:" + "\n" + "S = " + ((sideOne + sideTwo) / 2) * height;

    }
}
