package day14_practice_tasks.device;

public abstract class Phone extends Device {
    public Phone(String brand, String model, String size, double price, String color,
                 boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, size, price, color, hasBattery, hasPowerButton);
    }
   public void  call (long phoneNum){
       System.out.println(phoneNum + " is calling");
   }
    public void  text(long phoneNum){
        System.out.println( phoneNum +" is being tested ");
    }

    @Override
    public void turnOn() {
        System.out.println( getBrand() + " "+ getModel() +" phone turns on");    }
    @Override
    public void turnOff() {
        System.out.println(getBrand() + " "+ getModel() +" phone turns off");
    }


}
