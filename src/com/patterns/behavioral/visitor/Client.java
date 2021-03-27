package com.patterns.behavioral.visitor;

public class Client {

    public static void main(String[] args) {

        Car car = new Car();

        car.getCarParts().add(new Wheel("wheel1"));
        car.getCarParts().add(new Wheel("wheel2"));
        car.getCarParts().add(new Wheel("wheel3"));
        car.getCarParts().add(new Wheel("wheel4"));

        car.getCarParts().add(new Light("light1"));
        car.getCarParts().add(new Light("light2"));

        car.getCarParts().add(new Engine("engine"));

        car.upgrade();;
        car.print();
        car.render();
    }
}
