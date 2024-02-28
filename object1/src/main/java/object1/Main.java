package object1;

import java.util.logging.Logger;

public class Main {

    public static void main(String... args) {
        Logger logger=Logger.getLogger(Main.class.getName());
        logger.info("This is a module-using Hello World!");

    Person person1 = new Person();
        person1.setHeight(90);
        System.out.println(person1.getHeight());

        Car volvo = new Car();
        volvo.setMake("Volvo");
        System.out.println(volvo.getMake());

        Dog joe = new Dog();
        joe.setAge(4);
        System.out.println(joe.getAge());
    }
}
