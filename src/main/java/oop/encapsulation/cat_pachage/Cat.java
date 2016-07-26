package oop.encapsulation.cat_pachage;

public class Cat {
    public int publicField;
    int packageField;
    protected int protectedField;
    private int privateField;

    void doSomething(){
        int publicField = this.publicField;
        int packageField = this.packageField;
        int protectedField = this.protectedField;
        int privateField = this.privateField;
    }

    public static void staticMakeVoice(Cat cat){
        cat.nonStaticMakeVoice();
        System.out.println("Myawww");
    }

    public void nonStaticMakeVoice(){
        /*Good g1 = new Good("Milk", 20);
        Good g1 = new Good("Milk", 20);
        Good g1 = new Good("Milk", 20);
        Good g1 = new Good("Milk", 20);
        g1.getId*/
        System.out.println("Myawww");
    }
}
