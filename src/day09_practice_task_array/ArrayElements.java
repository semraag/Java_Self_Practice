package day09_practice_task_array;

import java.util.Arrays;

public class ArrayElements {

    public static void main(String[] args) {

        int [] numbers = new int[100];
        for (int i = 0; i < numbers.length ; i++) {
            numbers[i] = i+1;
        }
        System.out.println(Arrays.toString(numbers));

        int [] reservedNum = reversenumbers(numbers);
        System.out.println(Arrays.toString(reservedNum));


        divisionByFive(numbers);
    }
    public static int []reversenumbers(int[] numbers){
        if (numbers.length <= 1){
            return  numbers;
        }
        int[] reversednumbers = new int[numbers.length];
        for (int i = numbers.length - 1,j = 0 ; i >= 0;i--,j++) {
            reversednumbers[j] = numbers[i];
        }
        return reversednumbers;
    }

    public static void  divisionByFive(int [] numbers) {


        for (int number : numbers) {
            if (number % 5 == 0){
                System.out.print(number +", ");

            }
        }



    }



}
/* Create a class named ArrayElements and write a program with the following specifications:
   1.1 Create an array of integers with a length of 100.
   1.2 Assign values from 1 to 100 to the indexes of the array.
   1.3 Display the array elements in a single line separated by spaces.
   1.4 Display the array elements in a single line in reversed order, separated by spaces.
   1.5 Display all evenly divisible elements by 5 in a single line separated by spaces.*/
