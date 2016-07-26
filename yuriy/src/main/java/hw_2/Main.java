package hw_2;

/**
 * Created by shast on 7/24/2016.
 */
import java.util.Arrays;
import java.lang.System;
public class Main {
    public static void main(String[] args) {
        Product p1 = new Product("Milk", 4.50, "date");
        Product p2 = new Product("Eggs", 6.75, "date");
        Product p3 = new Product("Beer", 8.40, "date");
        Product p4 = new Product("Beef", 2.75, "date");
        Product p5 = new Product("Bred", 1.05, "date");
        Product p6 = new Product("Chicken", 5.50, "date");
        Product p7 = new Product("Tomatoes", 0.25, "date");
        Product p8 = new Product("Plumps", 2.15, "date");
        Product p9 = new Product("Grape", 11.30, "date");
        Product p10 = new Product("Carrot", 4.56, "date");

        Product[] productsArray = new Product[]{p1, p2, p3, p4, p5, p6, p7, p8, p9, p10};

        Arrays.sort(productsArray, Product.NameCompare);
        System.out.println("Name: " + Arrays.toString(productsArray));

        Arrays.sort(productsArray, Product.PriceCompare);
        System.out.println("Price: " + Arrays.toString(productsArray));

        Arrays.sort(productsArray, Product.DateCompare);
        System.out.println("Date: " + Arrays.toString(productsArray));
    }
}