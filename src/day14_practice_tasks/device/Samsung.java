package day14_practice_tasks.device;

public class Samsung extends Phone implements AndroidApps{
    public Samsung(String brand, String model, String size, double price, String color, boolean hasBattery,
                   boolean hasPowerButton) {
        super(brand, model, size, price, color, hasBattery, hasPowerButton);
    }

    @Override
    public void call(long phoneNum) {
        System.out.println(getBrand()+" "+getModel()+" "+phoneNum +" is calling ");  }
    @Override
    public void text(long phoneNum) {
        System.out.println(" Testing number "+phoneNum+" on "+getBrand()+" "+getModel()); }
    @Override
    public void turnOn() {
        System.out.println( getBrand()+" "+getModel() +" phone  is turn on");
    }
    @Override
    public void turnOff() {System.out.println( getBrand()+" "+getModel() +" phone  is turn on"); }
    @Override
    public void downloadApp() {
        System.out.println(getBrand() +" "+ getModel()+ " is downloading app "+ APP_STORE_NAME);
    }
}
