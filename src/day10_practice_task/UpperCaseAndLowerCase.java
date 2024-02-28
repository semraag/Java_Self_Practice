package day10_practice_task;

public class UpperCaseAndLowerCase {
    public static void main(String[] args) {
         int upperCase =0;
         int loverCase = 0;
        String str = "JAVA java";
        for (int i = 0; i < str.length() ; i++) {

            if( (Character.isLowerCase (str.charAt(i)))){
                loverCase++;

            } else if (Character.isUpperCase((str.charAt(i)))) {
                upperCase++;
            }
        }
        System.out.println(loverCase == upperCase);
    }
}
/*Create a class called UpperCaseAndLowerCase and write a program with the following specifications:
   2.1 Given a string, return true if the total number of uppercase characters is equal to the total
    number of lowercase characters.

	        Eamplex:
	            str = "JAVA java";

	        output:
	            true   */