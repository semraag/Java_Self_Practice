package day07_practice_tasks;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {

        Scanner circle = new Scanner(System.in);

        System.out.println("Enter the radius: ");

        int radius = circle.nextInt();
        double PI = 3.14;
        circle.close();

        System.out.println("The area of the circle is: "+ (PI*radius*radius));
        System.out.println("The perimeter of the circle is: "+ (2*PI*radius));
    }
}
