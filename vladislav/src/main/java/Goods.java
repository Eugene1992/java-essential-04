package hw;
import java.text.SimpleDateFormat;
import java.util.Date;

 class Goods  {

    private String name;
    private int id;
    private double price;
    private String date;
    private static int id_Start = 1111111;

    Goods(String name, int price) {
        this.name = name;
        this.id = id_Start++;
        this.price = price;
        this.date = formatDate.format(dateOne);
    }

    Date dateOne = new Date();
    SimpleDateFormat formatDate = new SimpleDateFormat("День dd Месяц MM Год yyyy Время hh:mm");

     String getName() {
        return name;
    }

     String getDate() {
        return date;
    }

     int getId() {
        return id;
    }

     double getPrice() {
        return price;
    }
}
