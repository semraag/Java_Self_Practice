package day08_practice_task;

import java.util.Scanner;

public class Name {

    public static void main(String[] args) {

        Scanner name = new Scanner(System.in);

        System.out.println("Enter your first name:");
        String fName = name.next();

        System.out.println("Enter your last name:");
        String lName = name.next();

        fName= fName.toLowerCase();
        lName = lName.toLowerCase();
        name.close();

        System.out.print(fName.substring(0,1).toUpperCase()+fName.substring(1)+" ");
        System.out.print(lName.substring(0,1).toUpperCase()+lName.substring(1));
    }
}
