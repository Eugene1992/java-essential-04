package com.collections;


import java.util.ArrayList;
import java.util.LinkedList;

public class MainActivity {

    static int count = 10_000;


    public static void main(String[] args) {

        ArrayList <Integer> arrayList = new ArrayList<>();
        LinkedList <Integer> linkedList = new LinkedList<>();

        long timeout;

        // add to ArrayList
        timeout = System.currentTimeMillis();
        for (int i = 0; i < count; i++){

            arrayList.add(i);
        }
        System.out.println("ArrayList add() = " + (System.currentTimeMillis() - timeout));

        //get from ArrayList
        timeout = System.currentTimeMillis();
        for (int i = 0; i < arrayList.size(); i++){

            arrayList.get(i);
        }
        System.out.println("ArrayList get() = " + (System.currentTimeMillis() - timeout));

        //set to ArrayList
        timeout = System.currentTimeMillis();
        for (int i = 0; i < arrayList.size(); i++){

            arrayList.set(i, 5);
        }
        System.out.println("ArrayList set() = " + (System.currentTimeMillis() - timeout));

        //remove from ArrayList
        timeout = System.currentTimeMillis();
        for (int i = 0; i < arrayList.size(); i++){

            arrayList.remove(Integer.valueOf(i));
        }
        System.out.println("ArrayList remove() = " + (System.currentTimeMillis() - timeout));

        System.out.println();

        //add to LinkedList
        timeout = System.currentTimeMillis();
        for (int i = 0; i < count; i++){

            linkedList.add(i);
        }
        System.out.println("LinkedList add() = " + (System.currentTimeMillis() - timeout));

        //get from LinkedList
        timeout = System.currentTimeMillis();
        for (int i = 0; i < linkedList.size(); i++){

            linkedList.get(i);
        }
        System.out.println("LinkedList get() = " + (System.currentTimeMillis() - timeout));

        //set to LinkedList
        timeout = System.currentTimeMillis();
        for (int i = 0; i < linkedList.size(); i++){

            linkedList.set(i, 5);
        }
        System.out.println("LinkedList set() = " + (System.currentTimeMillis() - timeout));

        //remove from LinkedList
        timeout = System.currentTimeMillis();
        for (int i = 0; i < linkedList.size(); i++){

            linkedList.remove(Integer.valueOf(i));
        }
        System.out.println("LinkedList remove() = " + (System.currentTimeMillis() - timeout));





    }
}
