package Lesson2_incapsulation;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

/**
 * Created by main_ on 23.07.2016.
 */
public class GoodsStorage {
    public static void main(String[] args) {
        ArrayList<Goods> storage = new ArrayList<>();

        Goods goods1 = new Goods("Bread", 8.5f, generateRandomDate());
        Goods goods2 = new Goods("Cheese", 18.5f, generateRandomDate());
        Goods goods3 = new Goods("Milk", 10.0f, generateRandomDate());
        Goods goods4 = new Goods("Sprite", 4.0f, generateRandomDate());
        Goods goods5 = new Goods("Vodka", 13.0f, generateRandomDate());
        Goods goods6 = new Goods("Cocaine", 1000.0f, generateRandomDate());
        Goods goods7 = new Goods("Spagetti", 3.0f, generateRandomDate());
        Goods goods8 = new Goods("Nesquick", 12.0f, generateRandomDate());
        Goods goods9 = new Goods("Drug", 100.0f);
        Goods goods10 = new Goods("Coca-Cola", 4.5f, generateRandomDate());

        storage.add(goods1);
        storage.add(goods2);
        storage.add(goods3);
        storage.add(goods4);
        storage.add(goods5);
        storage.add(goods6);
        storage.add(goods7);
        storage.add(goods8);
        storage.add(goods9);
        storage.add(goods10);

        for(Goods item : storage){
            System.out.println(item);
        }
    }

    private static Date generateRandomDate(){
        Calendar cld = Calendar.getInstance();
        Random generator = new Random();
        cld.set(16, generator.nextInt(7), generator.nextInt(31), generator.nextInt(24), generator.nextInt(60));
        return cld.getTime();
    }
}
