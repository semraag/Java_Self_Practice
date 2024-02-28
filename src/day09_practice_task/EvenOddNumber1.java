package day09_practice_task;

public class EvenOddNumber1 {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5, 6, 7};
        EvenNum(arr1);
        System.out.println();
        OddNum(arr1);
    }
    public static void EvenNum(int[] num) {
        int evennum = 0;
        for (int i = 0; i < num.length; i++) {

            if (num[i] % 2 == 0) {
                evennum ++;
            }
        }
        System.out.print("The array has "+evennum +" Even number");
    }

    public static void OddNum(int[] num) {
        int Oddnum = 0;
        for (int i = 0; i < num.length; i++) {

            if (num[i] % 2 != 0) {
                Oddnum++;
            }
        }
        System.out.print("The array has "+Oddnum +" Odd number");
    }
}
