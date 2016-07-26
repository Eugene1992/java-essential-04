package oop.encapsulation.cat_pachage;

public class InnerClass {
    public static void main(String[] args) {
        Cat cat = new Cat();
        int packageField = cat.packageField;
        int protectedField = cat.protectedField;
        int publicField = cat.publicField;
    }
}
