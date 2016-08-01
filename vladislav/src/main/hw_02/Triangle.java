package hw_02;


 class Triangle extends Shape {
     Triangle() {
        super();
    }

    public void maturation() {
        int area = ((sideA * height) / 2);
        System.out.println("Area of a Triangle = " + area + ";");
    }
}
