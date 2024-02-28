package day13_practice_tasks.employee;

public class Driver extends Employee{
    public Driver(String name, String employeeId, String jobTitle, String companyName, double salary) {
        super(name, employeeId, jobTitle, companyName, salary);
    }
    @Override
    public void work() {
        System.out.println(getName() + " is driving");
    }
}
