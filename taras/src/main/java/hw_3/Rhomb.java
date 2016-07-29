package hw_3;

public class Rhomb extends Square {
    Rhomb() {
    }

    Rhomb(int a, int h, int alpha) {
        this.a = a;
        this.h = h;
        this.alpha = alpha;
    }

    public String areCalculate() {
        return "Phomb S = " + a * h + "\n" + "           S = a*a*SinAlpha = " + a * a * Math.sin(Math.toRadians(alpha));
    }
}
