package day14_practice_tasks.car;

public class CydeoCar extends Car implements AutoPilot, AutoPark, Flyable {

    public CydeoCar(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }
    @Override
    public void autoPark() {
        System.out.println(getMake() +" is autoParking ");
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
    public void fly() {
        System.out.println( getMake()+" is flying.");
    }
    @Override
    public void selfDrive() {
        System.out.println(getMake() + " is self driving ");
    }
}
