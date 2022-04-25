package inheritance;
//Hierarchical
public class Person {
   // int id;
    String collegeName = "Sihngad";
    void walk(){
        System.out.println("Walking.....");
    }
}
class Student extends Person{
    int marks = 75;
    void study(){
        System.out.println("Studying....");
    }
}

class Professor extends Person{
    int salary = 50000;
    void teach(){
        System.out.println("teaching....");
    }
}

class PersonImpl{
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.teach();
        professor.walk();
        System.out.println(professor.salary);
        System.out.println(professor.collegeName);
        Student student = new Student();
        student.study();
        student.walk();
        System.out.println(student.collegeName);
        System.out.println(student.marks);

    }
}