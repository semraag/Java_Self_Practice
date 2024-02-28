package day13_practice_tasks.student;

import day13_practice_tasks.student.Student1;

public class CydeoStudent extends Student1 {
    private int batchNumber,groupNumber;
    private String programmingLanguage;

    public CydeoStudent(String name, String gender, int age, String studentId, String fieldOfStudy,
                        char grade, String schoolName, int batchNumber, int groupNumber, String programmingLanguage) {
        super(name, gender, age, studentId, fieldOfStudy, grade, schoolName);
        setBatchNumber(batchNumber);
        setGroupNumber(groupNumber);
        setProgrammingLanguage(programmingLanguage);
    }
    public int getBatchNumber() {return batchNumber;}
    public int getGroupNumber() {return groupNumber;}
    public String getProgrammingLanguage() {return programmingLanguage;}
    public void setBatchNumber(int batchNumber) {
        this.batchNumber = batchNumber;     }
    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;      }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void study() {
        super.study();
    }

    @Override
    public String toString() {
        return super.toString()+"{" +
                "batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", programmingLanguage='" + programmingLanguage + '\'' +
                '}';
    }
}
