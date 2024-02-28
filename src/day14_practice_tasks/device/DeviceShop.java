package day14_practice_tasks.device;

import day14_practice_tasks.car.AutoPark;
import day14_practice_tasks.car.AutoPilot;
import day14_practice_tasks.car.Flyable;

public class DeviceShop {
    public static void main(String[] args) {

        Device[] devices = {
                new Samsung("Samsung", "A71", "6.7 inc", 200, "Black", false, true),
                new IPhone("IPhone", "15 Pro", "6.12 inc", 1200, "Silver", false, true),
                new Google("Google", "Pixel 8", "6.2 inc", 850, "Silver", false, true),
                new Laptop("Asus", "ZenBook Pro 14 ", "14.5 inc", 2500, "Black", false, true),

        };
        for (Device device : devices) {
            System.out.println(device.getBrand() + " " + device.getModel() + " introduction");
            System.out.println(device);
            
            if (device instanceof AppleApps) {
                ((Downloadable) device).downloadApp();
            }
            if (device instanceof AndroidApps) {
                ((Downloadable) device).downloadApp();
            }
            if (device instanceof Computer) {
                ((Computer) device).work();
                ((Computer) device).update();
            }
            if (device instanceof Phone) {
                ((Phone) device).call(1234567890);
                ((Phone) device).text(1234567890);
            }
            device.turnOff();
            device.turnOn();
            System.out.println("-----------------------------------------------------------------------");
        }
    }
}