package oop.comp;

import java.util.Comparator;

public class CatByAgeComporator implements Comparator<Cat> {

    @Override
    public int compare(Cat cat1, Cat cat2) {
        if (cat1.getAge() > cat2.getAge()){
            return 1;
        } else if (cat1.getAge() < cat2.getAge()) {
            return -1;
        } else return 0;
    }
}
