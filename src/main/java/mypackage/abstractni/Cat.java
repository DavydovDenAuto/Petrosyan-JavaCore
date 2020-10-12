package mypackage.abstractni;

public class Cat extends Animal{
    @Override
    public void saySmth() {
        System.out.println("Mew");
    }

    @Override
    public void eat() {
        System.out.println("I'm full");
    }
}
