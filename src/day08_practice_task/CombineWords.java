package day08_practice_task;

import java.util.Scanner;

public class CombineWords {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Enter you first word:");
        String word1 = input.next();

        System.out.println("Enter you second word:");
        String word2 = input.next();

        System.out.println(word1.charAt(word1.length()-1) == word2.charAt(0)?
                (word1 + word2.substring(1)): (word1 + " " +word2));

        input.close();



    }
}
