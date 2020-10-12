package mypackage.nasledovanie;

public class Animal {
    int newIncaps_var;
    String name;
    String color;

    public void walk(String place) {
        newIncaps_var = 10;
        System.out.println("We are walking here: " + place);
    }

    public void sleep() {
        System.out.println("zzz");
    }

    public void sound() {
        System.out.println("HELLO");
    }

}
