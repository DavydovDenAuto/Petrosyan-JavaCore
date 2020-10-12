package mypackage.abstractni;

public class Dog extends Animal{

    @Override
    public void saySmth() {
        System.out.println("Gav");
    }

    @Override
    public void eat() {
        System.out.println("I like eating");
    }
    public void sit(){
        System.out.println("I'm sitting");
    }
}
