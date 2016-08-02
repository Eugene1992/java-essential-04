package exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MoreThanTwo extends Employee {

    public static void moreThanTwo() {
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < Employee.countOfEmp; i++) {

            System.out.print("Write name: ");
            name = scan.next();

            System.out.print("Write surname: ");
            surname = scan.next();

            System.out.print("Write position: ");
            position = scan.next();

            System.out.print("Write salary: ");
            salary = scan.nextInt();

            System.out.println();

            infAboutEmp.addAll(Arrays.asList(name, surname, position, salary));
        }

        for (int i = 0; i < infAboutEmp.size(); i++) {
            System.out.println(infAboutEmp.get(i));
        }
        System.out.println();
    }
}
