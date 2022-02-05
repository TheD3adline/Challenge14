package com.company;

public class Main {

    public static void main(String[] args) {

        Car car1 = new Car(250, "Blue");
        Car car2 = new Car();

        Car car3 = new Car(270);

        car3.addition(10, 2);
        car3.addition(40.3f, 50.2f);

    }
}
