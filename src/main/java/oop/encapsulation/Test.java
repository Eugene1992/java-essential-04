package oop.encapsulation;

import oop.encapsulation.cat_pachage.Human;

public class Test {
    public static void main(String[] args) throws Exception {
        Human human = new Human("Eugene", 12);
        human.setName("Eugene");
        human.setAge(-2_000_000_000);

        new Human().move();

        System.out.println(human.getName());
        System.out.println(human.getAge());

        Single single = Single.getInstance();
    }
}
