package oop.reflex;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Cat cat = new Cat();

        Cat clone1 = (Cat) cat.clone();
        Cat clone2 = new Cat(cat);


        System.out.println(cat.equals(clone1));
        System.out.println(cat.equals(clone2));
    }
}
