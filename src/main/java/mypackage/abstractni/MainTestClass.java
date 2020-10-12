package mypackage.abstractni;

public class MainTestClass {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        dog.walk("outside");
        dog.saySmth();
        cat.saySmth();
    }
}
