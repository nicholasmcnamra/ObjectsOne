package object1;

import java.util.logging.Logger;

public class Main {

    public static void main(String... args) {
        Logger logger=Logger.getLogger(Main.class.getName());
        logger.info("This is a module-using Hello World!");

    Person[] people = new Person[10];

    Person person1 = new Person("James", 25);

    people[0] = person1;

    System.out.println(people[0].getHeight());

    Person john = new Person();
        john.setHeight(90);
        john.setName("John");
        System.out.println(john.getName());
        System.out.println(john.getHeight());

        Car volvo = new Car();
        volvo.setMake("Volvo");
        System.out.println(volvo.getMake());

        Dog joe = new Dog();
        joe.setAge(4);
        System.out.println(joe.getAge());
    }
}
