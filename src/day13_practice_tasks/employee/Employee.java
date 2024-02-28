package day13_practice_tasks.employee;

public class Employee {

    private String  name ,employeeId,jobTitle,companyName;
    private  double salary;

    public Employee(String name, String employeeId, String jobTitle, String companyName, double salary) {
        setName(name);
        setEmployeeId(employeeId);
        setJobTitle(jobTitle);
        setCompanyName(companyName);
        setSalary(salary);
    }

    public String getName() {return name;}
    public String getEmployeeId() {return employeeId;}
    public String getJobTitle() {return jobTitle;}
    public String getCompanyName() {return companyName;}
    public double getSalary() {return salary;}
    public void setName(String name) {
        if (name == null || name.isEmpty() || name.isBlank()) {
            System.err.println("Name can not be null, empty or blank " + name);
            System.exit(1);
        }
        this.name = name;
    }
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
    public void setCompanyName(String companyName) {
        if (companyName == null || companyName.isEmpty() || companyName.isBlank()) {
            System.err.println("Company name can not be null, empty or blank " + companyName);
            System.exit(1);
        }
        this.companyName = companyName;
    }
    public void setSalary(double salary) {
        if (salary < 0){
            System.err.println("Salary can not be negative " + salary);
            System.exit(1);
        }
        this.salary = salary;
    }
    public void  work(){
        System.out.println(name + " is working " + jobTitle);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +" {" +
                "name='" + name + '\'' +
                ", employeeId='" + employeeId + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", companyName='" + companyName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
