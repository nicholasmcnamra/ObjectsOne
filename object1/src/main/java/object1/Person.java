package object1;

public class Person {
    private String name;
    private int height;
    // height to be entered in centimeters

//This is a constructor
    public Person(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public Person() {
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public int getHeight() {
        return height;
    }

}
