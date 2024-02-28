package day09_practice_task;

import java.util.Arrays;

public class ClassMatesReversed {

    public static void main(String[] args) {

        String[] classMattes = {"Ahmet Cemal", "Can Berk", "Salih Celal", "Selma Gün", "Ozan Koc", "Mirza Nur",
                "Ayla Cetin", "Mehmet Yörük", "Batu Han", "Mustafa Ay"};


        //  6.3

        String[] reversedClassMattes = new String[classMattes.length];
        for (int i = classMattes.length - 1, j = 0; i >= 0; i--, j++) {
            reversedClassMattes[j] = classMattes[i];
            System.out.println(reversedClassMattes[j]);

        }
    }
}
/* Create a class named ClassMatesReversed and write a program with the following specifications:
   6.1 Create an array of strings named classmates.
   6.2 Store full names of 10 classmates.
   6.3 Reverse each student's name and print them on separate lines.*/