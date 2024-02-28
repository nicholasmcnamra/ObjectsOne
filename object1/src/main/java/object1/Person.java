package object1;

public class Person {
    int height = 0;
    // height to be entered in centimeters

    public Person(int height) {
        this.height = height;
    }
    public Person() {
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public int getHeight() {
        return height;
    }
}
