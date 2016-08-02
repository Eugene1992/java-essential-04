//package exercises;
//
//import java.util.*;
//
//public class Compare extends Employee {
//
//    public Compare(String name, String surname, String position, int salary) {
//        this.name = name;
//        this.surname = surname;
//        this.position = position;
//        this.salary = salary;
//    }
//
//    public static Comparator<InputIfMore> surnmCompare = new Comparator<InputIfMore>() {
//        @Override
//        public int compare(InputIfMore o1, InputIfMore o2) {
//            return o1.getName().compareTo(o2.getName());
//        }
//    };
//
//    public static Comparator<InputIfMore> salaryCompare = new Comparator<InputIfMore>() {
//        @Override
//        public int compare(InputIfMore o1, InputIfMore o2) {
//            return o1.getSalary() - o2.getSalary();
//        }
//    };
//
//
//}
