package exercise;

import java.util.Arrays;
import java.util.Scanner;

public class LessThanTwo extends Employee {

    public static void lessThanTwo() {
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < countOfEmp; i++) {

            System.out.print("Write name: ");
            name = scan.next();

            System.out.print("Write surname: ");
            surname = scan.next();

            System.out.print("Write position: ");
            position = scan.next();

            System.out.print("Write salary: ");
            salary = scan.nextInt();

            infAboutEmp.addAll(Arrays.asList(name, surname, position, salary));

        }

        System.out.println(infAboutEmp.get(0)); // print one employee
    }
}
