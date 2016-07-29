package hw_3;

public class Main {
    public static void main(String[] args) {
        Parallelogram p = new Parallelogram(5, 5, 5, 90);
        Quadrate q = new Quadrate(2);
        Rectangle r = new Rectangle(4, 3);
        Rhomb rh = new Rhomb(3, 4, 0);
        Triangle tr = new Triangle(3, 4);
        Trapeze t = new Trapeze(2, 3, 4);

        System.out.println(p.areCalculate());
        System.out.println(q.areCalculate());
        System.out.println(r.areCalculate());
        System.out.println(rh.areCalculate());
        System.out.println(tr.areCalculate());
        System.out.println(t.areCalculate());
    }

    }

