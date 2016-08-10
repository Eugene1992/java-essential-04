package oop;

import oop.reflex.Cat;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();

        Class<Cat> catClass1 = (Class<Cat>) cat.getClass();
        Class<Cat> catClass2 = Cat.class;

    }
}
