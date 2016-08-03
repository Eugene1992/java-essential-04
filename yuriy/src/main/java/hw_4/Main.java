package hw_4;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayList arrList = new ArrayList();

//        add();
        long a = System.currentTimeMillis();
        System.out.println(a);
        for (int i = 0; i <1000_000 ; i++) {
            arrList.add(i);
        }
        long i1 = System.currentTimeMillis();
        System.out.println(i1);
        System.out.println("ArrayList add 1000_000: " + (i1 - a));

        System.out.println();

        LinkedList linkedList = new LinkedList();
        long l = System.currentTimeMillis();
        System.out.println(l);
        for (int i = 0; i <1000_000 ; i++) {
            linkedList.add(i);
        }
        long l1 = System.currentTimeMillis();
        System.out.println(l1);
        System.out.println("LinkedList add 1000_000: " + (l1 - l));

        System.out.println();

//        get();
        long d = System.currentTimeMillis();
        System.out.println(d);
        Object d0 = arrList.get(999_999);
        long d1 = System.currentTimeMillis();
        System.out.println(System.currentTimeMillis());
        System.out.println("ArrayList get 999_999: " + (d1 - d));

        System.out.println();

        long g = System.currentTimeMillis();
        System.out.println(d);
        Object g0 = arrList.get(999_999);
        long g1 = System.currentTimeMillis();
        System.out.println(System.currentTimeMillis());
        System.out.println("LinkedList get 999_999: " + (g1 - g));

        System.out.println();

//        set();
        long s = System.currentTimeMillis();
        System.out.println(d);
        Object s0 = arrList.set(999999, 56);
        long s1 = System.currentTimeMillis();
        System.out.println(System.currentTimeMillis());
        System.out.println("ArrayList set 999_999 to 56: " + (s1 - s));

        System.out.println();

        long s2 = System.currentTimeMillis();
        System.out.println(d);
        Object s01 = linkedList.set(999999, 56);
        long s3 = System.currentTimeMillis();
        System.out.println(System.currentTimeMillis());
        System.out.println("ArrayList set 999_999 to 56: " + (s3 - s2));

        System.out.println();

//        remove();
        long r = System.currentTimeMillis();
        System.out.println(d);
        Object r0 = arrList.remove(999999);
        long r1 = System.currentTimeMillis();
        System.out.println(System.currentTimeMillis());
        System.out.println("ArrayList remove 999_999: " + (r1 - r));

        System.out.println();

        long r2 = System.currentTimeMillis();
        System.out.println(g);
        Object r01 = linkedList.remove(999999);
        long r3 = System.currentTimeMillis();
        System.out.println(System.currentTimeMillis());
        System.out.println("LinkedList remove 999_999: " + (r3 - r2));
    }
}
