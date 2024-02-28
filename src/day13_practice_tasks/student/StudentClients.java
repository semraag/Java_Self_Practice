package day13_practice_tasks.student;

public class StudentClients {
    public static void main(String[] args) {
        CydeoStudent cydeoStudent = new CydeoStudent("Semra","Female",44,"49","SDET",'A',
                "CYDEO",33,12,"JAVA");
        cydeoStudent.study();
        System.out.println(cydeoStudent);
        System.out.println("------------------------------------------------------------------------");


        UndergraduateStudent undergraduateStudent = new UndergraduateStudent("Ali","Male",15,"12",
                "MATH",'B',"MARMARA UNI.");
        undergraduateStudent.study();
        System.out.println(undergraduateStudent);

        System.out.println("-------------------------------------------------------------------------------");

        GraduateStudent graduateStudent = new GraduateStudent("Halil","Male",22,"45",
                "Informatik",'A',"ISTANBUL UNI.");
        graduateStudent.study();
        System.out.println(graduateStudent);
    }
}
