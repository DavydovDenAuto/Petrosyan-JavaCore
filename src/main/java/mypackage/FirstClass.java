package mypackage;

import java.util.*;

public class FirstClass {
    public static void main(String[] args) {
        Car bmw = new Car();
        bmw.color = "red";
        bmw.length = 5000;
        bmw.height = 2000;
        bmw.weight = 1900;
        //нагрузим бэху
        bmw.addWeight(50);
        bmw.drive(280);

        System.out.println();

        bmw.addWeight(800);
        bmw.drive(100);

        Car nissan = new Car();
        nissan.color = "black";
        System.out.println();
        nissan.drive(150);

        Car skoda = new Car("black",2100, 2000, 5000);
        System.out.println(skoda.color + " " + skoda.width);

        System.out.println();

        //Car.vart = 25;
        Car.method();
        System.out.println(bmw.vart);
        System.out.println(nissan.vart);

        System.out.println();

        String.format("New %s string", "string");
        Math.cos(1);
        nissan.color = "grey";

    }
}
