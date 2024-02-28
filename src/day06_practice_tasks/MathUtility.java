package day06_practice_tasks;

public class MathUtility {
    public static void main(String[] args) {
        double  result1 = calculate(30,'*',5);
        System.out.println(result1);

        double result2  = calculate( 2.5,'*', 3.0);  // 5.2
        System.out.println(result2);

        int result3 = calculate(8,'*',8);// 5.3
        System.out.println(result3);

        double result4 =calculate(1.5,'*',1.5);   // 5.4
        System.out.println(result4);

        int result5=cube(3);
        System.out.println(result5);

        double result6 = cube(2.5);
        System.out.println(result6);
    }
    public static int calculate(int num1, char mathOp, int num2) {

        return (mathOp == '+') ? num1 + num2 : (mathOp == '-') ? num1 - num2
                : (mathOp == '*') ? num1 * num2 : (mathOp == '/') ? num1 / num2
                : num1 % num2;}  // 5.1
    public static double calculate(double num1, char mathOp, double num2) {

        return (mathOp == '+') ? num1 + num2 : (mathOp == '-') ? num1 - num2
                : (mathOp == '*') ? num1 * num2 : (mathOp == '/') ? num1 / num2
                : num1 % num2;
    }
    //  5.2
    public static int square(int a){
        return calculate(a, '*',a);
    }                                          // 5.3
    public static double square(double b) {
        return b*b ;
    }                                          // 5.4
    public static int cube(int a){
        return square(a)*a;
    }                               //  5.5
     public static double cube(double b){
        return square(b)*b;
    }



}

