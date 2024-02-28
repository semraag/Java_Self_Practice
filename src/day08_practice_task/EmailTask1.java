package day08_practice_task;

import java.util.Scanner;

public class EmailTask1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your E Mail:");
        String eMail = input.nextLine();


        String fName = eMail.substring(0,eMail.indexOf("_"));
        String lName = eMail.substring(eMail.indexOf("_")+1,eMail.indexOf("@"));

        if(eMail.contains("_")){
            System.out.println(lName+"_"+fName+"@gmail.com");
        }else {
            System.out.println(eMail);
        }

    }


}
