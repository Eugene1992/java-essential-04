package googleSolution;

import java.util.Arrays;
import java.util.Comparator;
public class Employee implements Comparable<Employee> {
    private int id;
    private String name;
    private int age;
    private long salary;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public long getSalary() {
        return salary;
    }

    public Employee(int id, String name, int age, int salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int compareTo(Employee emp) {
        //давайте будем сортировать объекты Employee по значению поля id от меньшего к большему
        //будем возвращать отрицательное число, 0 или положительное число по каждому сравнению объектов
        // здесь мы просто отнимаем значение поля одного объекта от значения поля другого объекта
        // в результате получим 1 из 3 вариантов описанных выше вариантов
        return (this.id - emp.id);
    }
    // переопределяем метод таким образом, чтобы
    // он возвращаем информацию об объекте в читабельном виде
    public String toString() {
        return "" + this.id + ", " + this.name + ", " + this.age + ", " + this.salary + "]";
    }

    //Comparator для сортировки списка или массива объектов по зарплате
    public static Comparator<Employee> SalaryComparator = new Comparator<Employee>() {


        public int compare(Employee e1, Employee e2) {
            return (int) (e1.getSalary() - e2.getSalary());
        }
    };

    //Comparator для сортировки списка или массива объектов по возрасту
    public static Comparator<Employee> AgeComparator = new Comparator<Employee>() {


        public int compare(Employee e1, Employee e2) {
            return e1.getAge() - e2.getAge();
        }
    };

    //Comparator для сортировки списка или массива объектов по имени
    public static Comparator<Employee> NameComparator = new Comparator<Employee>() {

        public int compare(Employee e1, Employee e2) {
            return e1.getName().compareTo(e2.getName());
        }
    };

    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Bob", 25, 50);
        Employee e2 = new Employee(2, "Bob2", 24, 55);

        Employee[] arr = {e1, e2};

        Arrays.sort(arr, Employee.NameComparator);
        System.out.println("Name: " + Arrays.toString(arr));

        Arrays.sort(arr, Employee.AgeComparator);
        System.out.println("Age: " + Arrays.toString(arr));

        Arrays.sort(arr, Employee.SalaryComparator);
        System.out.println("Salary: " + Arrays.toString(arr));
    }
}