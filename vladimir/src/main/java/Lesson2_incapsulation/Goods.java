package Lesson2_incapsulation;

import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

/**
 * Describes goods item
 */
public class Goods implements Comparable<Goods> {
    private static int idCounter = 0;
    private int id = 0;
    private String name = "unknown";
    private float price = 0.00f;
    private Date creationDate = new Date();

    public Goods(){
        id = ++Goods.idCounter;
    }

    public Goods(String name, float price) {
        this();
        setName(name);
        setPrice(price);
    }

    public Goods(String name, float price, Date creationDate) {
        this(name, price);
        setCreationDate(creationDate);
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        if(!name.isEmpty()) {
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    public void setPrice(float price) {
        if(price >= 0) {
            this.price = price;
        }
    }

    public float getPrice() {
        return price;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getCreationDate() {
        SimpleDateFormat ft = new SimpleDateFormat("dd.MM.yy 'at' HH:mm");
        return ft.format(creationDate);
    }

    @Override
    public int compareTo(Goods o) {
        if( this.getPrice() > o.getPrice() ){
            return 1;
        }

        if(this.getPrice() < o.getPrice() ){
            return -1;
        }

        return 0;
    }

    @Override
    public String toString() {
        return "ID: " + this.id + "\nName: '" + getName() + "'\nCreation date: " + getCreationDate() + "\nPrice: " + getPrice() + "\n";
    }
}
