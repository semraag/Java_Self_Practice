package day13_practice_tasks.student;

public class Student {
    private  String name,gender;        private  int age;


    public String getName() {return name;}

    public String getGender() {return gender;}

    public int getAge() {return age;}

    public void setName(String name) {
        if (name == null || name.isEmpty() || name.isBlank()){
            System.err.println("Invalid input/data for the name: " + name);
            System.exit(1);
        }

        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;     }

    public void setAge(int age) {
        if (age<0){
            System.err.println("Age can not be negative: "+age);
            System.exit(1);
        }
        this.age = age;     }
    public Student(String name, String gender, int age) {
        setName(name);
        setGender(gender);
        setAge(age);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}
