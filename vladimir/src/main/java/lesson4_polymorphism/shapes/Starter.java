package lesson4_polymorphism.shapes;

/**
 * Created by main_ on 28.07.2016.
 */
public class Starter {
    public static void main(String[] args) {
        Shape circle = new Circle(3);
        Shape parallelepiped = new Parallelepiped(12, 3);
        Shape rect = new Rectangle(34, 4);
        Shape rhombus = new Rhombus();
        ((Rhombus)rhombus).setAlpha(90);
        ((Rhombus)rhombus).setSideA(3);
        Square square = new Square(5);
        Shape trapecia = new Trapecia(4, 5, 8);
        Shape triangle = new Triangle(4, 5);

        showMustGoOn(circle, parallelepiped, rect, rhombus, square, trapecia, triangle);
    }

    private static void showMustGoOn(Shape ... shapes ) {
        for (Shape shape : shapes) {
            System.out.println(shape.getClass().getName());
            System.out.println(shape.getSquare());
            System.out.println();
        }
    }
}
