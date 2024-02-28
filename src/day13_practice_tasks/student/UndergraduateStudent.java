package day13_practice_tasks.student;

import day13_practice_tasks.student.Student1;

public class UndergraduateStudent extends Student1 {
    public UndergraduateStudent(String name, String gender, int age, String studentId, String fieldOfStudy, char grade, String schoolName) {
        super(name, gender, age, studentId, fieldOfStudy,
                grade, schoolName);
    }

    @Override
    public void study() {
        super.study();
    }

    @Override
    public String toString() {
        return super.toString()+"{}";
    }
}
