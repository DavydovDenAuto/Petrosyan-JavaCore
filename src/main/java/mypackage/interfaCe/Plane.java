package mypackage.interfaCe;

public class Plane implements Transport{
    @Override
    public void go() {
        System.out.println("I'm flying");
    }
    @Override
    public void stop() {
        System.out.println("I'm landed");
    }
    public void setSpeed(int speed){
        System.out.println("Our speed is: "+speed);
    }
}
