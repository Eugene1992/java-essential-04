package hw_02;


public class Main {
     static void creatingShapes(Shape i) {
        i.maturation();
    }

    public static void main(String[] args) {

        Shape foursquare = new Foursquare();
        Shape Rectangle = new Rectangle();
        Shape Circle = new Circle();
        Shape Rhombus = new Rhombus();
        Shape Triangle = new Triangle();
        Shape Parallelogram = new Parallelogram();
        Shape Trapeze = new Trapeze();

        creatingShapes(foursquare);
        creatingShapes(Rectangle);
        creatingShapes(Circle);
        creatingShapes(Rhombus);
        creatingShapes(Triangle);
        creatingShapes(Parallelogram);
        creatingShapes(Trapeze);
    }
}
