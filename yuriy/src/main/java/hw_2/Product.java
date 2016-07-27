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
        return date + "| " + name + "| " + price + "| " + id +"\n";
    }
    Product(){}
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
    public static Comparator<Product> IdCompare = new Comparator<Product>() {
        public int compare(Product o1, Product o2) {
            return (int) o1.getId() - o2.getId();
        }
    };
    static Product p1 = new Product("Milk", 4.50, "date");
    static Product p2 = new Product("Eggs", 6.75, "date");
    static Product p3 = new Product("Beer", 8.40, "date");
    static Product p4 = new Product("Beef", 2.75, "date");
    static Product p5 = new Product("Bred", 1.05, "date");
    static Product p6 = new Product("Chicken", 5.50, "date");
    static Product p7 = new Product("Tomatoes", 0.25, "date");
    static Product p8 = new Product("Plumps", 2.15, "date");
    static Product p9 = new Product("Grape", 11.30, "date");
    static Product p10 = new Product("Carrot", 4.56, "date");

    static Product[] productsArray = new Product[]{p1, p2, p3, p4, p5, p6, p7, p8, p9, p10};
}









