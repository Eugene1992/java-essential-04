package hw_2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Comparator;

/**
 * Created by Тарас on 27.07.2016.
 */

    public class Goods implements Comparable<Goods> {
        public int compareTo(hw_2.Goods o) {return 0;}

        private String name;
        private String date;
        private int id;
        private double price;
        private static int ID_START_VALUE = 100000;

        Calendar dating = Calendar.getInstance();
        SimpleDateFormat formatting = new SimpleDateFormat("HH:mm:ss:SSS");

        public String toString() {
            return id + " [" + date + "] |"+ name + "| " + price + "$ \n";
        }
    Goods(){}
    Goods(String name, double price, String date) {
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

        public static Comparator<Goods> NameCompare = new Comparator<Goods>() {
            public int compare(Goods o1, Goods o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };
        public static Comparator<Goods> PriceCompare = new Comparator<Goods>() {
            public int compare(Goods o1, Goods o2) {
                return Double.compare(o1.getPrice(), o2.getPrice());
            }
        };
        public static Comparator<Goods> DateCompare = new Comparator<Goods>() {
            public int compare(Goods o1, Goods o2) {
                return o1.getDate().compareTo(o2.getDate());
            }
        };
        public static Comparator<Goods> IdCompare = new Comparator<Goods>() {
            public int compare(Goods o1, Goods o2) {
                return (int) o1.getId() - o2.getId();
            }
        };
        static Goods p1 = new Goods("Cheese", 5.25, "date");
        static Goods p2 = new Goods("Bread", 1.75, "date");
        static Goods p3 = new Goods("Vodka", 15.39, "date");
        static Goods p4 = new Goods("Beer", 2.35, "date");
        static Goods p5 = new Goods("Fish", 10.25, "date");
        static Goods p6 = new Goods("Meat", 12.57, "date");
        static Goods p7 = new Goods("Milk", 4.85, "date");
        static Goods p8 = new Goods("Bananas", 3.55, "date");
        static Goods p9 = new Goods("Orange", 2.99, "date");
        static Goods p10 = new Goods("Potatoes", 2.05, "date");

        static Goods[] goodsArray = new Goods[]{p1, p2, p3, p4, p5, p6, p7, p8, p9, p10};
    }
