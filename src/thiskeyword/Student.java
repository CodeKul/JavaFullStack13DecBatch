package thiskeyword;

/**
 * 3. used to invoke current class constructor
 */
public class Student {
    int rollNo;
    String name;
    Student(){
        this("ABC");
        System.out.println("Default constructor");
    }
    Student(int rollNo){
        this();
        System.out.println("Roll No "+rollNo);
    }
    Student(String name){
        System.out.println("Name is "+name);
    }
    public static void main(String[] args) {
        Student student = new Student(10);
    }
}

/**HomeWork
 *  class Student{
 *      int rollNo;
 *      String name;
 *      String dept;
 *      double fees;
 *      String collegeName;
 *      Student(rollNo,name,collegeName);
 *      Student(dept,fees);//
 *      Print all details of student in 2nd constructor
 *      by using this keyword
 *  }
 */
