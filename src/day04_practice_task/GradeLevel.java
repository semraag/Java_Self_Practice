package day04_practice_task;

public class GradeLevel {
    public static void main(String[] args) {

       byte gradeLevel = 4;

       if( gradeLevel >=1 && gradeLevel<=5) {
           System.out.println("Elementary school");
       } else if (gradeLevel >=6 && gradeLevel<=8){
            System.out.println("Middle school");
       }else if( gradeLevel >=9 && gradeLevel<=12){
            System.out.println("High school");
       } else if (gradeLevel >=13 && gradeLevel<=16){
            System.out.println("College");
       } else if(gradeLevel >=17 && gradeLevel<=18) {
           System.out.println("Grad school");
       } else {
           System.out.println(" Invalide grade level");




       }
    }
}
