package day13_practice_tasks.student;

import day13_practice_tasks.student.Student;

public class Student1 extends Student {
    private String fieldOfStudy, schoolName;
    private final String studentId;
    private char grade;


    public Student1(String name, String gender, int age, String studentId, String fieldOfStudy, char grade, String schoolName) {
        super(name, gender, age);
        this.studentId = studentId;
        this.fieldOfStudy = fieldOfStudy;
        this.grade = grade;
        this.schoolName = schoolName;
    }

    public String getFieldOfStudy() {return fieldOfStudy;}
    public String getSchoolName() {return schoolName;}
    public String getStudentId() {return studentId;}
    public char getGrade() {return grade;}
    public void setFieldOfStudy(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }
    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;}
    public void setGrade(char grade) {
        this.grade = grade;}
    public  void study(){
        System.out.println(super.getName() + " is studying in "+ schoolName);
    }

    @Override
    public String toString() {
        return super.toString() +"{" +
                "fieldOfStudy='" + fieldOfStudy + '\'' +
                ", schoolName='" + schoolName + '\'' +
                ", studentId='" + studentId + '\'' +
                ", grade=" + grade +
                '}';
    }
}
