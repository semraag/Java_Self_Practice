package day07_practice_tasks;

import java.util.Scanner;

public class GradeReport {
    public static void main(String[] args) {

        Scanner gradeReport = new Scanner(System.in);
        System.out.println("Enter your score:");
        int score = gradeReport.nextInt();
        gradeReport.close();


        if (score < 0 || score > 100) {
            System.out.println("Invalid score");
        }
        System.out.println((score < 60) ?"Your grade is F ":(score < 70)?"Your grade is D ":
                (score < 80)? "Your grade is C":(score < 90)?"Your grade is B ":"Your grade is A" );

    }
}