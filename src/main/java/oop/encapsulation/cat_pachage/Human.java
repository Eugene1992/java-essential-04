package oop.encapsulation.cat_pachage;

public class Human {
    private String name;
    private int age;

    public Human(){
    }

    public Human(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name) throws Exception {
        if (!name.isEmpty()) {
            this.name = name;
        } else {
            throw new Exception();
        }
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        if (age > 0){
            this.age = age;
        } else {
            System.out.println("Negative age");
        }

    }

    public void move(){
        someMethod();
    }

    private void someMethod(){
        System.out.println();
        System.out.println();
        System.out.println();
    }

    public void sleep(){
        someMethod();
    }


}
