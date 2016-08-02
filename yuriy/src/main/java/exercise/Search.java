package exercise;

import java.util.*;

public class Search extends Employee {

    public static void searchEmployee() {

        Scanner scan = new Scanner(System.in);
        System.out.print("Write employee's name, surname or position: ");
        String position = scan.next();

        int index = infAboutEmp.indexOf(position);

        System.out.println(index);
        System.out.println("It is: " + infAboutEmp.get(index));
    }
}
