package hw_02;


 class Rectangle extends Shape {
     Rectangle() {
        super();
    }

    public void maturation() {
        int area = (int) Math.pow(sideA, 2);
        System.out.println("Area of a Rectangle = " + area + ";");
    }
}