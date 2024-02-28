package day06_practice_tasks;

public class OddAndEven {
    public static void main(String[] args) {

        boolean oddNumber = isOdd(15);
        System.out.println(oddNumber);
 
        boolean evenNumber = isEven(21);
        System.out.println(evenNumber);
    }
    public static boolean isOdd(int num ){

       /* if (num %2!= 0){
            return true ;
        }else{
            return false ;  */

        return (num %2!= 0)? true: false ;
    }
    public static boolean isEven(int num ){
       /* if (num % 2 == 0){
            return true ;
        }else{
            return false;*/
        return ( num %2 ==0 )? true : false ;

    }

}
