package hw_02;


 class Trapeze extends Shape {
     Trapeze() {
        super();
    }

    public void maturation() {
        int area = ((sideA + sideB) * height) / 2;
        System.out.println("Area of a Trapeze = " + area + ";");
    }
}
