package hw_2;
import java.util.Arrays;
import java.lang.System;

public class Main extends Goods{
    public static void main(String[] args) {
        Goods p1 = new Goods("Cheese", 5.25, "date");
        Goods p2 = new Goods("Bread", 1.75, "date");
        Goods p3 = new Goods("Vodka", 15.39, "date");
        Goods p4 = new Goods("Beer", 2.35, "date");
        Goods p5 = new Goods("Fish", 10.25, "date");
        Goods p6 = new Goods("Meat", 12.57, "date");
        Goods p7 = new Goods("Milk", 4.85, "date");
        Goods p8 = new Goods("Bananas", 3.55, "date");
        Goods p9 = new Goods("Orange", 2.99, "date");
        Goods p10 = new Goods("Potatoes", 2.05, "date");
        Goods[] goodsArray = new Goods[]{p1, p2, p3, p4, p5, p6, p7, p8, p9, p10};

        Arrays.sort(goodsArray, GoodsUtil.idCompare);
        System.out.println("Id: " + "\n " + Arrays.toString(goodsArray));
        Arrays.sort(goodsArray, GoodsUtil.dateCompare);
        System.out.println("Date: " + "\n " + Arrays.toString(goodsArray));
        Arrays.sort(goodsArray, GoodsUtil.nameCompare);
        System.out.println("Name: " + "\n " + Arrays.toString(goodsArray));
        Arrays.sort(goodsArray, GoodsUtil.priceCompare);
        System.out.println("Price: " + "\n " + Arrays.toString(goodsArray));
    }
}