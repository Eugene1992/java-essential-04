package hw_2;
import java.util.Comparator;
public class GoodsUtil {
    public static Comparator<Goods> nameCompare = new Comparator<Goods>() {
        public int compare(Goods o1, Goods o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };
    public static Comparator<Goods> priceCompare = new Comparator<Goods>() {
        public int compare(Goods o1, Goods o2) {
            return Double.compare(o1.getPrice(), o2.getPrice());
        }
    };
    public static Comparator<Goods> dateCompare = new Comparator<Goods>() {
        public int compare(Goods o1, Goods o2) {
            return o1.getDate().compareTo(o2.getDate());
        }
    };
    public static Comparator<Goods> idCompare = new Comparator<Goods>() {
        public int compare(Goods o1, Goods o2) {
            return (int) o1.getId() - o2.getId();
        }
    };
}
