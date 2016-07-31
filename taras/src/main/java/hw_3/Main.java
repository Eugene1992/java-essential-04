package hw_3;

public class Main {
    public static void main(String[] args) {

        Parallelogram p = new Parallelogram(5, 5, 5, 90);
        Quadrate q = new Quadrate(2);
        Rectangle r = new Rectangle(4, 3);
        Rhomb rh = new Rhomb(4, 4, 90);
        Triangle tr = new Triangle(3, 4);
        Trapeze t = new Trapeze(2, 3, 4);

        Figure[] figureArray = new Figure[]{p, q, r, rh, tr, r};

        printObject(figureArray);

    }

    public static void printObject(Figure[] figureArray) {

        for(Figure figure : figureArray)
    System.out.println(figure.calculate());

        }
    }



