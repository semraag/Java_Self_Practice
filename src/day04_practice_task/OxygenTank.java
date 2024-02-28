package day04_practice_task;

public class OxygenTank {
    public static void main(String[] args) {

        int Above = 90;
        switch (Above){

            case 90 -> System.out.println("Your tank is full ");
            case 80 ->System.out.println("Still okey ");
            case 70 ->System.out.println("Don`t go too far");
            case 60 ->System.out.println("Start to head back ");
            case 50 ->System.out.println("Be careful , you`re at 50% ");

        }
    }
}
