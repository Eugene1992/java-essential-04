package hw_02;


 class Circle extends Shape {
     Circle() {
        super();
    }

    public void maturation() {
        int area = (int) (numberPi * Math.pow(radius, 2));
        System.out.println("Area of a Circle = " + area + ";");
    }
}