package oop.comp;

public class Cat implements Comparable<Cat>{
    private String name;
    private int age;
    private String house;

    public Cat(String name, int age, String house) {
        this.name = name;
        this.age = age;
        this.house = house;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getHouse() {
        return house;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", house='" + house + '\'' +
                '}';
    }

    @Override
    public int compareTo(Cat cat) {
        if (this.age > cat.age) {
            return 1;
        } else if (cat.age > this.age) {
            return -1;
        } else return 0;
    }
}
