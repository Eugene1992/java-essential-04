package Hw_1;

/**
 * Created by shast on 7/22/2016.
 */
public class Girl {
    private String name, colorOfHair;
    private int age, height, weight;

    public Girl(){
    }

    public Girl(String name, String colorOfHair, int age, int height, int weight){
        this.name = name;
        this.colorOfHair = colorOfHair;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }
    public String toString(){
        return "Girl's properties: " + "name: " + name + " " + "colorOfHair: " + colorOfHair + " " + "age: " + age + " " + "height: " + height + " " + "weight: " + weight;
    }
}
