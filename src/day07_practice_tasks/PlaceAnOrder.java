package day07_practice_tasks;

import java.util.Scanner;

public class PlaceAnOrder {
    public static void main(String[] args) {

        Scanner placeAnOrder = new Scanner(System.in);

        System.out.println("Enter the product name:");
        String name = placeAnOrder.nextLine();

        System.out.println("Enter the price:");
        double price = placeAnOrder.nextDouble();

        System.out.println("Enter the quantity:");
        int quantity = placeAnOrder.nextInt();

        System.out.println("Enter the first name:");
        String firstName = placeAnOrder.next();
        double total = price * quantity;

        placeAnOrder.close();

        System.out.println(firstName+", your order for "+quantity+" "+name+
                " has been placed. Your total is "+total);

    }
}
