package day02_practice_tasks;

public class Task5 {
    public static void main(String[] args){

        String employeeName;
        int age;
        char gender;
        String companyName;
        String jobTitle;
        double yearsOfExperience;
        int salary;
        boolean isFullTime;
        boolean isMarried;
        String employeeId;

        employeeName= "Shay";
        age= 24;
        gender='F';
        companyName="Apple Inc";
        jobTitle="SDET";
        yearsOfExperience=2.5;
        salary=120_000;
        isFullTime= true;
        employeeId= "B101";
        isMarried= false;
        System.out.println("Employee name : "+employeeName);
        System.out.println("Gender : "+gender);
        System.out.println("Age : " +age);
        System.out.println("Employee ID : "+employeeId);
        System.out.println("Job title : "+jobTitle);
        System.out.println("Company name : "+companyName);
        System.out.println("Full time : "+isFullTime);
        System.out.println("Years of work experience : "+yearsOfExperience);
        System.out.println("Salary: "+salary);
        System.out.println("Married : "+isMarried);



    }
}
