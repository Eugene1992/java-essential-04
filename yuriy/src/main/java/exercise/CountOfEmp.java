package exercise;

import java.util.Scanner;

public class CountOfEmp extends Employee {

    public static int countOfEmp() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Write number of Employee : ");
        int numbOfEmp = scan.nextInt();
        return numbOfEmp;
    }
}
