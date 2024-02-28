package day08_practice_task;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {


        Scanner usr_input = new Scanner(System.in);
        System.out.println("Split or No split  (Yes or No )?");
        String yesOrNoSplit = usr_input.next();
        System.out.println("Enter the Number of People :");
        int num_people = usr_input.nextInt();
        System.out.println("Enter the check amount : ");
        int chk_amt = usr_input.nextInt();
        System.out.println("How was the service quality ? (Excellent/Great/Good/Fair/Poor)");
        String service = usr_input.next();
        usr_input.close();
        calculate(yesOrNoSplit, num_people, chk_amt, service);
    }

    public static void calculate(String yesOrNoSplit, int num_people, int chk_amt, String service) {
        if (yesOrNoSplit.equalsIgnoreCase("yes")) {
            double totalTip = chk_amt * 25 / 100;
            double tipPerPerson = totalTip / 4;
            double totalPerPerson = totalTip + tipPerPerson;
            double totalToPay = totalPerPerson * 4;
            System.out.println("Number of people entered:" + num_people);
            System.out.println("Total to pay :" + totalToPay);
            System.out.println("Total tip : " + totalTip);
            System.out.println("Total per person : " + totalPerPerson);
            System.out.println("Tip per person :" + tipPerPerson);

        }
    }
}