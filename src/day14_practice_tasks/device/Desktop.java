package day14_practice_tasks.device;

public class Desktop extends Computer {
    public Desktop(String brand, String model, String size, double price, String color, boolean hasBattery,
                   boolean hasPowerButton) {
        super(brand, model, size, price, color, hasBattery, hasPowerButton);
    }

    @Override
    public void turnOn() {
        System.out.println( " Desktop is turn on");
    }

    @Override
    public void turnOff() {
        System.out.println( " Desktop is turn off");
    }

    @Override
    public void work() {
        super.work();
    }

    @Override
    public void update() {
        super.update();
    }
}
