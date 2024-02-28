package day11_practice_task;

public class CydeoStudent {

    public String name ;
    public int age,id,groupNumber,batchNumber;
    public char grade;
     public static String schoolName = "Cydeo";
    public static String programmingLanguage = " Java";

    public CydeoStudent (String name, int age, int id, int groupNumber, int batchNumber, char grade) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.groupNumber = groupNumber;
        this.batchNumber = batchNumber;
        this.grade = grade;
    }

    public void study(){
        System.out.println(name + " is studying "+ schoolName);
    }
    public void attendClass(){

        System.out.println(name + " is attending the live class " );
    }
    public static void printSchoolName(){
        System.out.println( "School name is "+ schoolName);
    }
    public static void   printProgLanguage(){

        System.out.println( "Programming Language is "+programmingLanguage );
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", groupNumber=" + groupNumber +
                ", batchNumber=" + batchNumber +
                ", grade=" + grade +

                '}';
    }
}

