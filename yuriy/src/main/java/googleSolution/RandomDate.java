package googleSolution;

/**
 * Created by shast on 7/24/2016.
 */
import java.util.GregorianCalendar;
public class RandomDate {
    public static void randomDate() {
        GregorianCalendar gc = new GregorianCalendar();
        int year = randBetween(2013, 2016);
        gc.set(gc.YEAR, year);
        int dayOfYear = randBetween(1, 365);
        gc.set(gc.DAY_OF_YEAR, dayOfYear);
        int dayOfMonth = randBetween(1, 12);
        gc.set(gc.DAY_OF_MONTH, dayOfMonth);
        //System.out.println("Рік - " + gc.get(gc.YEAR) + "; " + "Місяць - " + (gc.get(gc.DAY_OF_MONTH) + 1) + "; " + "Число - " + gc.get(gc.DAY_OF_MONTH) + ".");
    }
    public static int randBetween(int start, int end) {
        return start + (int)Math.round(Math.random() * (end - start));
    }
}
