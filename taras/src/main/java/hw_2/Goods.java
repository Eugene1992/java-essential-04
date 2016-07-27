package hw_2;
import java.text.SimpleDateFormat;
import java.util.Calendar;
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

        }


