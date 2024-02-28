package day07_practice_tasks;

import java.util.Scanner;

public class CentsToDollars {
    public static void main(String[] args) {

        Scanner centsToDollars = new Scanner(System.in);
        System.out.println("Enter the cents: ");
        int totalCents = centsToDollars.nextInt();
        centsToDollars.close();

        int  dollar = totalCents /100;
        double cents = totalCents %100;

        System.out.println(totalCents+ " cents is equal to "+ dollar+" dollars and "+cents+ " cents" );


    }
}
