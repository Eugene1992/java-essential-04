package hw;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        /** Create new products and set only Name and Price,
         *  because Date and ID are generated independently in class product*/
        Goods productOne = new Goods("Apple", 5);
        Goods productTwo = new Goods("Pear", 10);
        Goods productThree = new Goods("Banana", 9);
        Goods productFour = new Goods("Melon", 8);
        Goods productFive = new Goods("Watermelon", 7);
        Goods productSix = new Goods("Peach", 6);
        Goods productSeven = new Goods("Strawberry", 10);
        Goods productEight = new Goods("Orange", 4);
        Goods productNine = new Goods("Grape", 3);
        Goods productTen = new Goods("Cherry", 13);
        Goods productEleven = new Goods("Pineapple", 1);

        /** Place items in an array*/
        Goods[] arrayProduct = {productOne, productTwo, productThree, productFour, productFive, productSix, productSeven, productEight, productNine, productTen, productEleven};

        /** Sort items by price in the array*/
        Arrays.sort(arrayProduct, new Comparator<Goods>() {
            public int compare(Goods o1, Goods o2) {
                return Double.compare(o1.getPrice(), o2.getPrice());
            }
        });

        /** Show the items with Cycle */
        for (Goods product : arrayProduct) {
            System.out.println("Price: " + product.getPrice());
            System.out.println("Name: " + product.getName());
            System.out.println("Id: " + product.getId());
            System.out.println("Date: " + product.getDate());
            System.out.println();
        }
    }
}



