package constructor;

public class Student {
    int rollNo;
    String name;
    double salary;
    Student(){
        System.out.println("in Default constructor");
    }
    void show(){
        System.out.println("Roll No:"+rollNo);
        System.out.println("Name: "+name);
        System.out.println("Salary: "+salary);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.show();
    }
}
