package day04_practice_task;

public class CreawAndPassenger {
    public static void main(String[] args) {

        int total = 60;
        String result;
        switch (total){

            case 50 -> result="20 crew, 30 passengers";
            case 75 ->result="20 crew, 30 passengers";
            case 100 -> result="20 crew, 30 passengers";
            default -> result= "not valid";

        }
        System.out.println(result);
    }
}
