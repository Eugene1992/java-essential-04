package oop.encapsulation;

import oop.encapsulation.cat_pachage.Cat;

public class CatChild extends Cat {
    public static void main(String[] args) {
        Cat cat = new Cat();
        //CatChild catChild = new CatChild();
        //int privateField = cat.privateField;
        //int packageField = cat.packageField;
        //int z = catChild.z;
        //int x = cat.x;

        cat = null;

        // cat.nonStaticMakeVoice(); // 1

        // cat.staticMakeVoice(); // 2

    }
}
