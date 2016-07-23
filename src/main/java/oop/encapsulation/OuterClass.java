package oop.encapsulation;

import oop.encapsulation.cat_pachage.Cat;

public class OuterClass {
    public static void main(String[] args) {
        Cat cat = new Cat();

        System.out.println(cat.publicField);

    }
}
