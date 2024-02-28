package day07_practice_tasks;

import java.util.Scanner;

public class MilesToKM {
    public static void main(String[] args) {

        Scanner milesToKM = new Scanner(System.in);
        System.out.println("Enter the miles: ");
        double miles = milesToKM.nextDouble();
        double KM = miles*1.609344;
        milesToKM.close();

        System.out.println(miles +" miles is equel to "+KM +" kilometers");



    }


}
