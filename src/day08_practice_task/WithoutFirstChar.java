package day08_practice_task;

import java.util.Scanner;

public class WithoutFirstChar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter two word:");

        String fword = input.next();
        String sword = input.next();

        System.out.println(fword.substring(1) + sword.substring(1));

        input.close();





    }
}
