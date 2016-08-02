package com.shapes;

public class MainActivity {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(2, 4);
        Shape quadrate = new Quadrate(2);
        Shape circle = new Circle(2);
        Shape rhombus = new Rhombus(2, 20);
        Shape triangle = new Triangle(2, 3);
        Shape parallelogram = new Parallelogram(2, 3);
        Shape trapeze = new Trapeze( 2 , 3 , 4);


        getResult(rectangle, quadrate, circle, rhombus, triangle, parallelogram, trapeze);

        System.out.println(Math.sin(20));

    }

    public static void getResult(Shape... shape){

        for(Shape result : shape){
            System.out.println(result.getSquer());
        }
    }
}
