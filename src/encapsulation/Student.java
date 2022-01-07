package encapsulation;

public class Student {
    private int rollNo;
    private String name;
    private String password; //write only
    private int age = 18; //read only
    //getters & setters

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        if (rollNo>0)
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }
}
class EncapsulationImpl{
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("codekul");
        student.setRollNo(1);
        student.setPassword("12345");
        System.out.println(student.getName());
        System.out.println(student.getRollNo());
        System.out.println(student.getAge());
    }
}
