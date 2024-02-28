package day08_practice_task;

import java.util.Scanner;

public class StartsWithX {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your word:");
        String word = input.next();

        System.out.println(word.startsWith("x")? word = word.replaceFirst("x","a"):word);

        input.close();
    }

   /* Create a class named StartsWithX and write a program that asks the user to enter a word.
    If the word starts with 'x,' replace it with 'a'.

    Example:
    Input:
    xcodex

    Output:
    acodex*/
}
