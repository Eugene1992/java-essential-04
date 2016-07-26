package googleSolution;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Arrays;
class MyClass implements Comparable<MyClass> {
    private String name;
    private double price;
    private double discount;
    private Calendar date;

    public MyClass(String name, double price, double discount, Calendar date) {
        this.name = name;
        this.price = price;
        this.discount = discount;
        this.date = date;
    }

    public int compareTo(MyClass that) {
        int nameCompare = this.name.compareTo(that.name);
        if (nameCompare != 0)
            return nameCompare;

        int dtCompare = this.date.compareTo(that.date);
        if (dtCompare != 0)
            return dtCompare;

        int priceCompare = Double.compare(this.price, that.price);
            if (priceCompare != 0)
                return priceCompare;

        return 0;
    }

    public String toString() {
        return name + ", " + price + ", " + discount + ", " +
                new SimpleDateFormat("dd.MM.yyyy").format(date.getTime());
    }
}

    class Tester {
    public static void main(String[] args) {
        Calendar dt1 = Calendar.getInstance();
        dt1.set(2013, Calendar.JUNE, 8);

        Calendar dt2 = Calendar.getInstance();
        dt2.set(2013, Calendar.JUNE, 1);

        Calendar dt3 = Calendar.getInstance();
        dt3.set(2013, Calendar.JUNE, 3);

        Calendar dt4 = Calendar.getInstance();
        dt4.set(2013, Calendar.JUNE, 4);

        MyClass a = new MyClass("a", 100., 0., dt1);
        MyClass b = new MyClass("b", 100., 0., dt2);
        MyClass b1 = new MyClass("b1", 100.56, 0.2, dt3);
        MyClass b2 = new MyClass("b2", 100.12, 0.4, dt4);
        MyClass[] arr = new MyClass[4];

        arr[0] = a;
        arr[1] = b;
        arr[2] = b1;
        arr[3] = b2;

        Arrays.sort(arr);
        Arrays.sort(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
    }
}



