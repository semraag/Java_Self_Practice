package day07_practice_tasks;

public class EmployeeClients {
    public static void main(String[] args) {

       Employee employee = new Employee();
       employee.name = "Josh";
       employee.age = 34;
       employee.gender = 'W';
       employee.jobTitle ="Tester";
       employee.salary = 65_000;

       employee.work();
        System.out.println(employee);




    }
}
