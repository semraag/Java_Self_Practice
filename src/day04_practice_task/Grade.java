package day04_practice_task;

public class Grade {
    public static void main(String[] args) {
        char grade = 'B';
        String result;

        switch (grade){

            case 'A'-> result ="Excellent";
            case 'B'-> result ="Great Job";
            case 'C'-> result ="Good";
            case 'D'-> result ="Passed";
            case 'F'-> result ="Failed";
            default -> result ="Invalid Grade";
        }
        System.out.println(result);

    }
}
