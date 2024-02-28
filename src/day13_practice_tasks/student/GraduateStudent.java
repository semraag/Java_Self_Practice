package day13_practice_tasks.student;

import day13_practice_tasks.student.Student1;

public class GraduateStudent extends Student1 {

    public GraduateStudent(String name, String gender, int age, String studentId, String fieldOfStudy, char grade, String schoolName) {
        super(name, gender, age, studentId, fieldOfStudy, grade, schoolName);
    }

    @Override
    public void study() {
        System.out.println(super.getName() + " studied at " +super.getSchoolName());
    }

    @Override
    public String toString() {
        return super.toString()+"{}";
    }
}
