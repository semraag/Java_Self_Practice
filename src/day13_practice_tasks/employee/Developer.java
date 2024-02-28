package day13_practice_tasks.employee;
public class Developer extends Employee{
   private String  programmingLanguage;
   public Developer(String name, String employeeId, String jobTitle, String companyName,
                     double salary, String programmingLanguage) {
        super(name, employeeId, jobTitle, companyName, salary);
       setProgrammingLanguage(programmingLanguage);
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void work() {
        System.out.println(getJobTitle() + " "+ getName() +" is coding in " +programmingLanguage);
    }

    @Override
    public String toString() {
        return super.toString() +" {" +
                "programmingLanguage='" + programmingLanguage + '\'' +
                '}';
    }
}
