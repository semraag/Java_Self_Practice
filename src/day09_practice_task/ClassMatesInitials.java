package day09_practice_task;

import java.util.Arrays;

public class ClassMatesInitials {
    public static void main(String[] args) {

        String[] classMattes = {"Ahmet Cemal", "Can Berk", "Salih Celal", "Selma Gün", "Ozan Koc", "Mirza Nur",
                "Ayla Kar", "Mehmet Yok", "Batu Han", "Mustafa Ay"};
        String[] initials = new String[classMattes.length];

        for (int i = 0; i < classMattes.length; i++) {

            initials[i] = classMattes[i].charAt(0) + "" + classMattes[i].charAt(classMattes[i].indexOf(" ") + 1);

        }
        System.out.println(Arrays.toString(initials));

    }
    }
/* Create a class named ClassMatesInitials and write a program with the following specifications:
        2.1 Create an array of strings named classmates.
   2.2 Store full names of 10 classmates.
   2.3 Print the initials of each student's name in separate lines. */
