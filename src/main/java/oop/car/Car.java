package oop.car;

class Car {
    String model;
    int speed = 10;
    int maxSpeed;
    static int staticField = 10;

    Car(){
        model = "Always Audi";
    }

    Car(String model, int maxSpeed, int speed){
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.speed = speed;
    }

    int move(int hours){
        return this.speed * hours;
    }

    static void someStaticMethod(){
        System.out.println("Static here");
    }
}
