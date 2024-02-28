package day14_practice_tasks.device;

public class Google extends Phone implements Downloadable,AndroidApps{
    public Google(String brand, String model, String size, double price, String color, boolean hasBattery,
                  boolean hasPowerButton) {
        super(brand, model, size, price, color, hasBattery, hasPowerButton);
    }

    @Override
    public void call(long phoneNum) {
        super.call(phoneNum);
    }

    @Override
    public void text(long phoneNum) {
        super.text(phoneNum);
    }

    @Override
    public void turnOn() {
        super.turnOn();
    }

    @Override
    public void turnOff() {
        super.turnOff();
    }

    @Override
    public void downloadApp() {

    }
}
