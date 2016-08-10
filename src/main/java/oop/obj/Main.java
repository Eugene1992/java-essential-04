package oop.obj;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException {
        Employee employee1 = new Employee("Evgeniy", 23, 10000);
        Employee employee2 = new Employee("Evgeniy", 23, 10000);

        employee1 = employee2;

        System.out.println(employee1.equals(employee2));





    }
}
