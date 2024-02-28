package day14_practice_tasks.device;

public class Laptop extends Computer {
    public Laptop(String brand, String model, String size, double price, String color,
                  boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, size, price, color, hasBattery, hasPowerButton);
    }
    @Override
    public void turnOn() {
        System.out.println( getBrand()+" "+getModel() +" Laptop  is turn on");
    }

    @Override
    public void turnOff() {
        System.out.println( getBrand()+" "+getModel() +" Laptop is turn on");
    }


}
