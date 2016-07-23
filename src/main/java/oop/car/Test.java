package oop.car;

public class Test{
    public static void main(String[] args) {
        Car car1 = new Car();
        System.out.println(car1.model);
        System.out.println(car1.speed);

        car1.model = "Fiat";
        car1.speed = 50;
        car1.maxSpeed = 150;

        System.out.println(car1.model);
        System.out.println(car1.speed);
        System.out.println(car1.maxSpeed);

        Car car2 = new Car("Ferrari", 130, 350);

        System.out.println(car2.model);
        System.out.println(car2.speed);
        System.out.println(car2.maxSpeed);

        System.out.println(car1.model + " distance = " + car1.move(6));
        System.out.println(car2.model + " distance = " + car2.move(6));

        System.out.println(Car.staticField);
        Car.someStaticMethod();
    }
}
