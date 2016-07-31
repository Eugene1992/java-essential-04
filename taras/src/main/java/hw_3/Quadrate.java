package hw_3;

public class Quadrate extends Figure {

    Quadrate(int sideOne) {

        this.sideOne = sideOne;

    }

    public String calculate() {

        return "Quadrate:" + "\n" + "S = " + sideOne * sideOne;

    }
}
