package day07_practice_tasks;

import java.util.Scanner;

public class FamilyMembers {
    public static void main(String[] args) {

        Scanner familyMembers = new Scanner(System.in);

        System.out.println( "How many people do you live with?");

        int numMembers = familyMembers.nextInt();
        familyMembers.close();

        if (numMembers < 0){
            System.err.println("Invalid number");
        }
        else if (numMembers < 3){
            System.out.println("Live with less than three people.");
        } else if (numMembers < 6) {
            System.out.println("Live with 3 -6 people.");
        }else{
            System.out.println("Live with more than six people.");
        }



    }
}
