package oop.reflex;

public class Cat implements Cloneable{
    public int x;
    int y;
    protected int z;
    private int a;
    String b;
    private final static int ID = 10;

    public Cat() {
    }

    public Cat(int x, int packageField, int z, int a) {
        this.x = x;
        this.y = packageField;
        this.z = z;
        this.a = a;
    }

    public Cat(Cat cat) {
        this(cat.getX(),
             cat.getY(),
             cat.getZ(),
             cat.getA()
        );
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public int getA() {
        return a;
    }

    public void doSomething(){
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cat cat = (Cat) o;

        if (x != cat.x) return false;
        if (y != cat.y) return false;
        if (z != cat.z) return false;
        if (a != cat.a) return false;
        return b != null ? b.equals(cat.b) : cat.b == null;

    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        result = 31 * result + z;
        result = 31 * result + a;
        result = 31 * result + (b != null ? b.hashCode() : 0);
        return result;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
