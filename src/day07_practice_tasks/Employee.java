package day07_practice_tasks;

public class Employee {
    public String name,jobTitle;
    public int age ;
     public char gender ;
     public double salary;


    public void setInfo(String name, String jobTitle, int age, char gender, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }

    public void work() {  System.out.println(name +" is working " + jobTitle);}

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", salary=" + salary +
                '}';
    }
}
/*Create a class named Employee with the following attributes and actions:

Attributes:
name (String): used for storing the name of the employee
age (int): used for storing the age of the employee
gender (char): used for storing the gender of the employee
jobTitle (String): used for storing the job title of the employee
salary (double): used for storing the job title

Actions:
work(): plays the job title and name of the employee concatenated with " is working."

toString(): returns a string representation of the employee object.

Create another class named EmployeeClients, create multiple employee objects,
and test each function of the employee object.
 */
