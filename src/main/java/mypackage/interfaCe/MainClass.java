package mypackage.interfaCe;

public class MainClass {
    public static void main(String[] args) {
        Car car = new Car();
        Plane plane = new Plane();

        car.go();
        car.stop();

        plane.go();
        plane.stop();
        plane.setSpeed(100);

        car.method1();
        car.method2();
    }
}
