package day14_practice_tasks.device;

public abstract class Computer extends Device{
    public Computer(String brand, String model, String size, double price, String color,
                    boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, size, price, color, hasBattery, hasPowerButton);
    }
    @Override
    public   void turnOn() {
        System.out.println(getBrand() + " "+ getModel()+ " computer turn on");
    }

    @Override
    public  void turnOff() {
        System.out.println(getBrand() + " "+ getModel()+ " computer turn off");
    }
    public void work() {
        System.out.println(getBrand() + " "+ getModel()+ " is working");
    }
    public void update() {

        System.out.println(getBrand() + " "+ getModel()+ " is updating");
    }

}
