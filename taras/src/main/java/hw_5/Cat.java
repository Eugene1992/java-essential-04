package hw_5;

import java.util.Comparator;

public class Cat implements Comparable<Cat> {

    private String name;
    private int age;
    private String city;

    public Cat(String name, int age, String city) {

        this.name = name;
        this.age = age;
        this.city = city;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }


    @Override
    public String toString() {

        return "Cat{" +
                "name = '" + name + '\'' +
                ", age = " + age + '\'' +
                ", city = '" + city +
                '}' + "\n";

    }

    @Override
    public int compareTo(Cat o) {

        int nameCompare = this.name.compareTo(o.name);
        if (nameCompare != 0) {
            return nameCompare;
        }

        int nameCompare2 = this.age - o.age;
        if (nameCompare2 != 0) {
            return nameCompare2;
        }

        int nameCompare1 = this.city.compareTo(o.city);
        if (nameCompare1 != 0) {
            return nameCompare1;
        }
        return 0;
    }

    static class CComparator implements Comparator<Cat> {

        @Override
        public int compare(Cat o1, Cat o2) {

            if (o1.getName().compareTo(o2.getName()) != 0) {
                return o1.getName().compareTo(o2.getName());
            }

            if (o1.getAge() - o2.getAge() != 0) {
                return o1.getAge() - o2.getAge();
            }

            if (o1.getCity().compareTo(o2.getCity()) != 0) {
                return o1.getCity().compareTo(o2.getCity());
            }
            return 0;
        }
    }
}

