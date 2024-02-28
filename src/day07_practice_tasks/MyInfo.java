package day07_practice_tasks;

import java.util.Scanner;

public class MyInfo {
    public static void main(String[] args) {

        Scanner myInfo = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = myInfo.nextInt();

        System.out.println("Enter your gender:");
        String gender = myInfo.next();

        System.out.println(" Enter your full name:");
        String fullName = myInfo.nextLine();

        System.out.println(" Enter your phone number:");
        long phoneNum = myInfo.nextLong();

        System.out.println(" Enter your zip code:");
        int zipCode = myInfo.nextInt();

        System.out.println(" Enter your School name:");
        String schoolName = myInfo.nextLine();

        System.out.println(" Enter your city name:");
        String cityName =myInfo.nextLine();

        System.out.println(" Enter your state name: ");
        String stateName = myInfo.next();

        System.out.println("Enter your building number:");
        int buildingNumber = myInfo.nextInt();

        System.out.println(" Enter your Street name:");
        String streetName = myInfo.nextLine();

        myInfo.close();

        System.out.println(fullName+"\n"+age+"\n"+gender+"\n"+phoneNum+"\nAdress:"+"\n\t"+buildingNumber+" "+
                streetName+"\n"+cityName+", "+stateName+" "+zipCode);
    }
}
