package hw_5;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        TreeSet<Cat> catTreeSet = new TreeSet<>();

        catTreeSet.add(new Cat("Armen", 3, "New York"));
        catTreeSet.add(new Cat("Armen", 2, "Montana"));
        catTreeSet.add(new Cat("Cat", 5, "Bermingham"));
        catTreeSet.add(new Cat("Clif", 4, "Venezia"));
        catTreeSet.add(new Cat("Isildur", 6, "Rome"));
        catTreeSet.add(new Cat("Fagot", 3, "Filadelfia"));
        catTreeSet.add(new Cat("Fagot", 7, "Filadelfia"));
        catTreeSet.add(new Cat("Lefort", 0, "Brovary"));

        System.out.println("Sorted by Comparable" + "\n"  + catTreeSet);

        System.out.println();

        Cat catOne = new Cat("Armen", 3, "New York");
        Cat catTwo = new Cat("Armen", 2, "Montana");
        Cat catThree = new Cat("Cat", 5, "Bermingham");
        Cat catFour = new Cat("Clif", 4, "Venezia");
        Cat catFive = new Cat("Isildur", 6, "Rome");
        Cat catSix = new Cat("Fagot", 3, "Filadelfia");
        Cat catSeven = new Cat("Fagot", 7, "Filadelfia");
        Cat catEight = new Cat("Lefort", 0, "Brovary");

        Cat[] catArr = new Cat[]{catOne, catTwo, catThree, catFour, catFive, catSix, catSeven,
                                catEight};

        Arrays.sort(catArr, new Cat.CComparator());
        System.out.println("Sorted by Comparator" + "\n" + Arrays.toString(catArr) + "\n");

//        Arrays.sort(catArr, Cat.CComparator.catNameComp);
//        System.out.println("Name: " + "\n" + Arrays.toString(catArr));
//
//        Arrays.sort(catArr, Cat.CComparator.catCityComp);
//        System.out.println("City: " + "\n" + Arrays.toString(catArr));
//
//        Arrays.sort(catArr, Cat.CComparator.catAgeComp);
//        System.out.println("Age: " + "\n" + Arrays.toString(catArr));
    }
}

