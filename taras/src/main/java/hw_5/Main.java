package hw_5;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        TreeSet<Cat> catTreeSet = new TreeSet<>();

        catTreeSet.add(new Cat("Garfild", 4, "London"));
        catTreeSet.add(new Cat("Sam", 3, "Amsterdam"));
        catTreeSet.add(new Cat("Abram", 8, "Chicago"));
        catTreeSet.add(new Cat("Lambert", 2, "Bern"));
        catTreeSet.add(new Cat("Sam", 3, "Studgard"));
        catTreeSet.add(new Cat("Zenit", 1, "Dymer"));
        catTreeSet.add(new Cat("Ozzi", 6, "Ottawa"));
        catTreeSet.add(new Cat("Lambert", 12, "Tokio"));

        System.out.println("Sorted by Comparable" + "\n"  + catTreeSet);

        System.out.println();

        Cat catOne = new Cat("Garfild", 4, "London");
        Cat catTwo = new Cat("Sam", 3, "Amsterdam");
        Cat catThree = new Cat("Abram", 8, "Chicago");
        Cat catFour = new Cat("Lambert", 2, "Bern");
        Cat catFive = new Cat("Sam", 3, "Studgard");
        Cat catSix = new Cat("Zenit", 1, "Dymer");
        Cat catSeven = new Cat("Ozzi", 6, "Ottawa");
        Cat catEight = new Cat("Lambert", 12, "Tokio");

        Cat[] catArr = new Cat[]{catOne, catTwo, catThree, catFour, catFive, catSix, catSeven,
                catEight};

        Arrays.sort(catArr, new Cat.CComparator());
        System.out.println("Sorted by Comparator" + "\n" + Arrays.toString(catArr) + "\n");

    }
}
