package ua.javarush.l12;

import ua.javarush.l12.car.Bus;
import ua.javarush.l12.car.Car;
import ua.javarush.l12.car.OffRoadCar;
import ua.javarush.l12.car.SportCar;

public class L12Main {
    public static void main(String[] args) {
        double d = 12.0 / 0;
        System.out.println(d);
        System.out.println(d * 10);
        System.out.println(d * (-10));
        System.out.println(d + 15);

        double d1 = 0.0 / 0.0;
        System.out.println(d1);
        System.out.println(d1 + 10);
        System.out.println(d1 * (-10));
        System.out.println("===================");
        byte b = 10;
        short s = b;
        int i = Integer.MAX_VALUE - 1; // int [10] - size(32)
        s = (short) i; // short [10] - size(16)
        System.out.println(s);
        System.out.println(i);
        System.out.println("====================");

        User user = new User();
        user.firstName = "John";
        user.age = 42;

        System.out.println(user.firstName);
        System.out.println(user.lastName);
        System.out.println(user.age);

        user.sayHello();

        System.out.println("===============");
        Developer developer = new Developer();
        Manager manager = new Manager();

        Employee employee = new Employee();

        System.out.println("======================");

        Car car = new Car();
        car = new SportCar();
        car = new Bus();
        car = new OffRoadCar();
        car = new Bus();
        


    }
}
