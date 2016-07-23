package com.oop;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

public class MainActivity {
    public static void main(String[] args) {

        ArrayList<Item> objectList = new ArrayList<>();

        DateFormat dateFormat = DateFormat.getDateTimeInstance();
        Date date = new Date();

        for (int i = 0; i < 10; i++) {

            Item item = new Item();

            item.setId(i + 1);
            item.setName("Object" + (i + 1));
            item.setCost((int) (Math.random() * 100));
            item.setDate(dateFormat.format(date) + "");

            objectList.add(item);
        }

        for (int i = 0; i < objectList.size(); i++) {

            System.out.println("ID = " + objectList.get(i).getId() + "\nName = " + objectList.get(i).getName() + "\nCost = " +
                    objectList.get(i).getCost() + "\nDate = " + objectList.get(i).getDate());
            System.out.println();
        }

        Collections.sort(objectList, new Comparator<Item>() {
            @Override
            public int compare(Item o1, Item o2) {
                if (o1.getCost() > o2.getCost()) {
                    return -1;
                } else if (o1.getCost() < o2.getCost()) {
                    return 1;
                }
                return 0;
            }
        });

        System.out.println("Sort by cost *************************************************");
        System.out.println();
        for (int i = 0; i < objectList.size(); i++) {

            System.out.println("ID = " + objectList.get(i).getId() + "\nName = " + objectList.get(i).getName() + "\nCost = " +
                    objectList.get(i).getCost() + "\nDate = " + objectList.get(i).getDate());
            System.out.println();
        }

        Collections.reverse(objectList);

        System.out.println("Sort by cost revers ***********************************************");
        System.out.println();
        for (int i = 0; i < objectList.size(); i++) {

            System.out.println("ID = " + objectList.get(i).getId() + "\nName = " + objectList.get(i).getName() + "\nCost = " +
                    objectList.get(i).getCost() + "\nDate = " + objectList.get(i).getDate());
            System.out.println();

        }
    }
}
