package day14_practice_tasks.device;

public class IPhone extends Phone implements AppleApps{
    public IPhone(String brand, String model, String size, double price, String color,
                  boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, size, price, color, hasBattery, hasPowerButton);
    }

    @Override
    public void call(long phoneNum) {
        System.out.println(getBrand()+" "+getModel()+" number of  "+phoneNum +" is calling ");
    }

    @Override
    public void text(long phoneNum) {
        System.out.println(" Testing number "+phoneNum+" on "+getBrand()+" "+getModel());
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
        System.out.println(getBrand() +" "+ getModel()+ " is downloading app "+ APP_STORE_NAME);
    }
}
