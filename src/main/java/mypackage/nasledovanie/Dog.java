package mypackage.nasledovanie;

public class Dog extends Animal {

    private int weight = 2;

    public int getWeight() {
        return weight;
    }

/*    public void setWeight(int weight) {
        this.weight = weight;
    }*/

    public void sit() {
        System.out.println("I'm sitting");
    }

    public void lay() {
        newIncaps_var = 100;
        System.out.println("I'm laying");
    }

}
