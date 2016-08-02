package exercise;
/*Определить структуру Employee (сотрудник), содержащую следующие поля:
 фамилия, имя, должность, зарплата.
 Разработать программу, которая хранит информацию обо всех сотрудниках фирмы
 в виде контейнера типа список.
 Реализовать:
 заполнение контейнера данными с клавиатуры;
 вывод информации о сотрудниках на экран;
 поиск сотрудников, состоящих на заданной должности;
 сортировку списка сотрудников по полю фамилия и по полю зарплата.﻿*/

import java.util.*;

public class Employee {

    protected static String name;
    protected static String surname;
    protected static String position;
    protected static int salary;

    Employee() {
        
    }

    static int countOfEmp = CountOfEmp.countOfEmp(); // count of employee
    static ArrayList infAboutEmp = new ArrayList();

    public static void main(String[] args) {

        if (countOfEmp < 2) {
            LessThanTwo.lessThanTwo();
        } else {
            MoreThanTwo.moreThanTwo();
        }
        Search.searchEmployee();
    }
}



