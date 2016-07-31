package hw_3;

public abstract class MainShape {
    protected double pNumber = 3.14;
    protected int sideA;
    protected int sideB;
    protected int radiusR;
    protected int height;
    protected int sinA;
    protected int sinY;

    MainShape() {

    }

    MainShape(double pNumber, int sinY, int sinA, int sideA, int sideB, int radiusR, int height) {
        this.pNumber = pNumber;
        this.sinY = sinY;
        this.sinA = sinA;
        this.sideA = sideA;
        this.sideB = sideB;
        this.radiusR = radiusR;
        this.height = height;
    }

    abstract public String areaCalc();

    public static void main(String[] args) {

        Rectangle rectOne = new Rectangle(5, 5);
        Square squarOne = new Square(2);
        Circle circOne = new Circle(4);
        Rhombus rhombOne = new Rhombus(90, 3, 3);
        Triangle trianOne = new Triangle(2, 2);
        Parallelogram parOne = new Parallelogram(90, 4, 4, 4);
        Trapeze trapOne = new Trapeze(2, 3, 4);

        printObjects(rectOne, circOne, rhombOne, trianOne, parOne, trapOne);
    }

    public static void printObjects(MainShape... figures) {
        for (MainShape mainshape : figures) {
            System.out.println(mainshape.areaCalc());

        }
    }
}
