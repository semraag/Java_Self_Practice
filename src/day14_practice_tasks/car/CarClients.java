package day14_practice_tasks.car;

import java.util.ArrayList;

public class CarClients    {

    public static void main(String[] args) {

        Car[] cars ={
                new Toyota("Toyota", "Corolla", 2021, 20_000, "Black"),
                new Mercedes("Mercedes", "300", 1886, 45000, "Black"),
                new Tesla("Tesla", "Y", 2021, 65000, "black"),
                new CydeoCar("Cydeo", "Java", 2024, 100000, "Black")
        };
        for (Car car : cars) {
            System.out.println(car.getMake() +" "+car.getModel() +" is testing");
            System.out.println(car);

            if (car instanceof AutoPark){
                ((AutoPark) car).autoPark();
            }
            if (car instanceof AutoPilot){
                ((AutoPilot) car).selfDrive();
            }
            if (car instanceof Flyable) {
                ((Flyable) car).fly();
            }
                car.stop();
                car.drive();
                car.start();
                System.out.println();
        }



    }
}