package day04_practice_task;

public class AgeGroupe {
    public static void main(String[] args) {


        int age = 90;

        String result;

        if (age >= 0 && age <= 150) {
            if (age >= 55) {
                result = "Senior";
            } else if (age >= 21) {
                result = "Adult";
            } else {
                result = "Teenager";
            }

        } else {
            result = "Invalid";
        }
        System.out.println(result);
    }
}

