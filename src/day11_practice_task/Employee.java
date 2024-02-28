package day11_practice_task;

public class Employee {
    public String name, jobTitle;
    public int age;
    public char gender;
    public double salary;


    public Employee(String name, String jobTitle) {
        this.name = name;
        this.jobTitle = jobTitle;
    }

    public Employee(String name, String jobTitle, int age) {
        this(name,jobTitle);
        this.age = age;
    }


    public Employee(String name, String jobTitle, int age, char gender) {
        this(name,jobTitle,age);
        this.gender = gender;
    }

    public Employee(String name, String jobTitle, int age, char gender, double salary) {
        this(name, jobTitle, age, gender);
        this.salary = salary;
    }

    public String work() {

        return (name + " works as a  " + jobTitle);
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", salary=" + salary +
                ", work=" + work() +
                '}';
    }

}
