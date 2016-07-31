package hw_3;

public class Rhomb extends Figure {

    Rhomb(int sideOne, int height, int alpha) {

        this.sideOne = sideOne;
        this.height = height;
        this.alpha = alpha;

    }

    public String calculate() {

        return "Phomb:" + "\n" + "S = " + sideOne * height + "\n" + "S = a*a*SinAlpha = " + sideOne * sideOne * Math.sin(Math.toRadians(alpha));

    }
}
