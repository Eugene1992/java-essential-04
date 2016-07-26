
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Test {
    public static void main(String[] args) {


            Calendar c = new GregorianCalendar();//календарь на текущую дату
            Calendar c2 = new GregorianCalendar(2013, 11, 25);//календарь на 25.11.2013
            c2.add(Calendar.DAY_OF_YEAR, 1); //увеличиваем дату на 1 день
            System.out.println(c2);// 26.11.2013
            c2.add(Calendar.DAY_OF_YEAR, -1); //уменьшаем дату на 1 день
            System.out.println(c2.getTime());

    }
}
