package hw_5;

import java.util.Comparator;

public class Cat implements Comparable<Cat> {
    private String name;
    private String city;
    private int age;

    public Cat(String name, int age, String city) {
        this.name = name;
        this.city = city;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name = '" + name + '\'' +
                ", city = '" + city + '\'' +
                ", age = " + age +
                '}' + "\n";
    }

    @Override
    public int compareTo(Cat o) {
        int nameCompare = this.name.compareTo(o.name);
        if (nameCompare != 0) {
            return nameCompare;
        }

        int nameCompare1 = this.city.compareTo(o.city);
        if (nameCompare1 != 0) {
            return nameCompare1;
        }

        int nameCompare2 = this.age - o.age;
        if (nameCompare2 != 0) {
            return nameCompare2;
        }
        return 0;
    }

    static class CComparator implements Comparator<Cat> {
        @Override
        public int compare(Cat o1, Cat o2) {
            if (o1.getName().compareTo(o2.getName()) != 0) {
                return o1.getName().compareTo(o2.getName());
            }
            if (o1.getCity().compareTo(o2.getCity()) != 0) {
                return o1.getCity().compareTo(o2.getCity());
            }
            if (o1.getAge() - o2.getAge() != 0) {
                return o1.getAge() - o2.getAge();
            }
            return 0;
        }

//        public static Comparator<Cat> catNameComp = (Cat o1, Cat o2)
//                -> o1.getName().compareTo(o2.getName());
//
//        public static Comparator<Cat> catCityComp = (Cat o1, Cat o2)
//                -> o1.getCity().compareTo(o2.getCity());
//
//        public static Comparator<Cat> catAgeComp = (Cat o1, Cat o2)
//                -> o1.getAge() - o2.getAge();
        }
    }
