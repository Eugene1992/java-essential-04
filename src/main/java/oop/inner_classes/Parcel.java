package oop.inner_classes;

public class Parcel {

    class Contents {
        private int i = 11;

        public int value() {
            return i;
        }
    }

    class Destination {
        private String label;

        Destination(String whereTo) {
            label = whereTo;
        }

        String readLabel() {
            return label;
        }
    }

    // Использование внутренних классов имеет много общего
    // с использованием любых других классов в пределах Parcel1
    public void ship(String dest) {
        Contents c = new Contents();
        Destination d = new Destination(dest);
        System.out.println(d.readLabel());
    }

    public static void main(String[] args) {
        Parcel p = new Parcel();
        p.ship("Tasmania");
    }
}