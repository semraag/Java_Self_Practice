package day11_practice_task;

import java.util.concurrent.Callable;

public class CydeoStudentClients {

    public static void main(String[] args) {

        CydeoStudent.printSchoolName();
        CydeoStudent.printProgLanguage();

        CydeoStudent student1 = new CydeoStudent("Zarife",25,123456,1,33,'A');
        student1.study();
        student1.attendClass();
        System.out.println("Student 1 = " + student1);

        System.out.println("--------------------------------------------------------------");

        CydeoStudent student2 = new CydeoStudent("Can",40,239849,11,21,'B');
         student2.study();
         student2.attendClass();
        System.out.println(student2);

        };
    }

