package hw_2;

/**
 * Created by shast on 7/24/2016.
 */
import java.util.Arrays;
import java.lang.System;
public class Main extends Product{
    public static void main(String[] args) {

        Arrays.sort(productsArray, Product.NameCompare);
        System.out.println("Name: " + "\n " + Arrays.toString(productsArray));

        Arrays.sort(productsArray, Product.PriceCompare);
        System.out.println("Price: " + "\n " + Arrays.toString(productsArray));

        Arrays.sort(productsArray, Product.DateCompare);
        System.out.println("Date: " + "\n " + Arrays.toString(productsArray));
    }
}