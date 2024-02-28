package day14_practice_tasks.car;

import day14_practice_tasks.car.Car;

public class Honda extends Car {
    public Honda(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println(getMake() + " is starting");
    }
    @Override
    public void drive() {
        System.out.println(getMake() + " is driving");
    }
    @Override
    public void stop() {
        super.stop();
    }


}
