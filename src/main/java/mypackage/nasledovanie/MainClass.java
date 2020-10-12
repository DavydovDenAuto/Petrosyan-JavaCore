package mypackage.nasledovanie;

public class MainClass {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();

        cat.name = "Barsik";
        dog.name = "Juchka";

        cat.color = "white";
        dog.color = "black";

        cat.walk("backyard");
        dog.walk("park");

        cat.feed("milk");
        dog.sit();

        System.out.println("Cat name is: " + cat.name);
        System.out.println("dog name is: " + dog.name);

        dog.newIncaps_var = 200;
        Animal animal = new Animal();
        animal.newIncaps_var=300;
        //dog.weight = 100;

        System.out.println();
        System.out.println(dog.getWeight());

        cat.sound();
        System.out.println();
        dog.sound();
        System.out.println();
        cat.sleep();

    }
}
