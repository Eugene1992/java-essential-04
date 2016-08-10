package oop.comp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Barsik", 2, "Kiev");
        Cat cat2 = new Cat("Murchik", 3, "Kharkov");
        Cat cat3 = new Cat("Marsik", 4, "Lvov");
        Cat cat4 = new Cat("Qwerty", 1, "Nikolaev");

        List<Cat> cats = new ArrayList<>();
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        cats.add(cat4);

        System.out.println(cats);

        Collections.sort(cats, new CatByAgeComporator());

        System.out.println(cats);






    }
}
