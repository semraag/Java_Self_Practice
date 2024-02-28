package day08_practice_task;

import java.util.Scanner;

public class EmailTask2 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Enter your E Mail:");
        String eMail = input.nextLine();
        String fName = eMail.substring(0, eMail.indexOf("_"));
        String lName = eMail.substring(eMail.indexOf("_") + 1, eMail.indexOf("@"));
        String domain = eMail.substring(eMail.indexOf("@") + 1, eMail.indexOf("."));

        input.close();

        System.out.println("First name: "+fName+"\nLast name: "+lName+"\nDomain: "+domain);

    }
}