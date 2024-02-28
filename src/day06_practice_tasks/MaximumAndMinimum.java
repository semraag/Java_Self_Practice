package day06_practice_tasks;

public class MaximumAndMinimum {
    public static void main(String[] args) {

        double n = max(10.5, 30.2);
        System.out.println(n);

        double m = min(10.5, 30.2);
        System.out.println(m);

        int a = max(100, 200);
        System.out.println(a);

        int b = min(100, 200);
        System.out.println(b);
    }
    public static int max(int num1, int num2) {
       /* int max = (num1 > num2) ? num1 : num2;
        return max; */

        return (num1 > num2 ) ? num1 : num2;
    }
    public static int min (int num1, int num2) {
        /* int min = (num1 < num2) ? num1 : num2;
        return min; */
        return ( num1 < num2 )? num1 : num2 ;
    }
    public static double max(double num1, double num2) {
      /*  double max = (num1 > num2) ? num1 : num2;
        return max;  */
        return (num1 > num2 )? num1 : num2;
    }
    public static double min(double num1, double num2) {
       /* double min = (num1 < num2) ? num1 : num2;
        return min;  */
        return ( num1 < num2)? num1 : num2;
    }
}


