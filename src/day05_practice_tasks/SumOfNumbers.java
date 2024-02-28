package day05_practice_tasks;

public class SumOfNumbers {
    public static void main(String[] args) {

        int sum = 0;
        int givenNumber= 100;
        for (int i = 1; i <= givenNumber ; i++) {
            sum += i;
        }

            System.out.println("Sum = " + sum);

    }
}
