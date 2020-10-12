package mypackage.interfaCe;

public class Car implements Transport, InterfaceTest {
    @Override
    public void go() {
        System.out.println("we are driving");
    }

    @Override
    public void stop() {
        System.out.println("we are stop");
    }

    @Override
    public void method1() {
        System.out.println("method1");
    }

    @Override
    public void method2() {
        System.out.println("method2");
    }
}
