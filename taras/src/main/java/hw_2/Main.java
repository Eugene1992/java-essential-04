package hw_2;

import java.util.Arrays;
import java.lang.System;
public class Main extends Goods{
    public static void main(String[] args) {
        Arrays.sort(goodsArray, Goods.IdCompare);
        System.out.println("Id: " + "\n " + Arrays.toString(goodsArray));
        Arrays.sort(goodsArray, Goods.DateCompare);
        System.out.println("Date: " + "\n " + Arrays.toString(goodsArray));

        Arrays.sort(goodsArray, Goods.NameCompare);
        System.out.println("Name: " + "\n " + Arrays.toString(goodsArray));

        Arrays.sort(goodsArray, Goods.PriceCompare);
        System.out.println("Price: " + "\n " + Arrays.toString(goodsArray));

    }
}