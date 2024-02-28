package day11_practice_task;

public class EmployeeClients {
    public static void main(String[] args) {

      Employee employee1 = new Employee("Baki","Doctor") ;
        System.out.println(employee1);

        Employee employee2 = new Employee("Ömer","Teacher",45);
        System.out.println(employee2);

        Employee employee3 = new Employee("Oya","Police",30,'f');
        System.out.println(employee3);

        Employee employee4 = new Employee("Alim","Tester",36,'m',68_000);
        System.out.println(employee4);
    }
}
