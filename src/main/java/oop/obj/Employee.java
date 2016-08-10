package oop.obj;

public class Employee implements Cloneable{
    private String name;
    private int age;
    private int salary;
    private static String privateField = "XXX";

    public Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (age != employee.age) return false;
        if (salary != employee.salary) return false;

        if (name != null) {
            return name.equals(employee.name);
        } else {
            return employee.name == null;
        }
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + salary;
        return result;
    }

    @Override
    public String toString() {
        return "Employee{ " + name + " - " + age + " - " + salary + " }";
    }

    public void doSomething(){

    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
