package oop.encapsulation;

public class Single {
    private static Single ourInstance = new Single();

    private Single() {
    }

    public static Single getInstance() {
        return ourInstance;
    }
}
