package day13_practice_tasks.employee;

public class EmployeeClients {
    public static void main(String[] args) {

        Tester tester = new Tester("Ali","AB33","Tester","Apple",90_000);
        tester.work();
        System.out.println(tester);

        System.out.println("-----------------------------------------------------------------");

        Developer developer = new Developer("Ayse","B33","Developer","Amazon",
                100_000,"JAVA");
        developer.work();
        System.out.println(developer);

        System.out.println("-------------------------------------------------------------");

        Teacher teacher = new Teacher("Batu","B033","Teacher",
                "Dogru Cevap",50_000);
        teacher.work();
        System.out.println(teacher);
    }
}
