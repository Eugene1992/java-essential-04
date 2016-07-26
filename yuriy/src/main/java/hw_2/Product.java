package hw_2;

/**
 * Created by shast on 7/23/2016.
 */
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Comparator;
public class Product implements Comparable<Product> {
    public int compareTo(Product o) {return 0;}

    private String name;
    private String date;
    private int id;
    private double price;
    private static int ID_START_VALUE = 100000;

    Calendar dating = Calendar.getInstance();
    SimpleDateFormat formatting = new SimpleDateFormat("HH:mm:ss:SSS");

    public String toString() {
        return date + "| " + name + "| " + price + "\n";
    }
    Product(String name, double price, String date) {
        this.date = formatting.format(dating.getTime());
        this.id = ID_START_VALUE++;
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public int getIdStartValue() {
        return ID_START_VALUE;
    }

    public static Comparator<Product> NameCompare = new Comparator<Product>() {
        public int compare(Product o1, Product o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };
    public static Comparator<Product> PriceCompare = new Comparator<Product>() {
        public int compare(Product o1, Product o2) {
            return Double.compare(o1.getPrice(), o2.getPrice());
        }
    };
    public static Comparator<Product> DateCompare = new Comparator<Product>() {
        public int compare(Product o1, Product o2) {
            return o1.getDate().compareTo(o2.getDate());
        }
    };
}









