package collection;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student {
    int rollNo;
    String name;
    String address;
    String section;
    String div;
    String schoolName;
}

public class StudentJdbcDemo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        initialiseObject(students);
    }

    private static void initialiseObject(List<Student> students) {
        Student s1 = new Student();
        s1.section = "";
        s1.name = "";
        s1.rollNo = 1;
        s1.address = "";
        s1.div = "";
        s1.schoolName = "";
        Student s2 = new Student();
        s2.section = "";
        s2.name = "";
        s2.rollNo = 1;
        s2.address = "";
        s2.div = "";
        s2.schoolName = "";
        students.add(s1);
        students.add(s2);
        insert(students);
    }

    private static void insert(List<Student> students) {
        //database connection
        for (Student s:students) {
            //insert query
            //s.rollNo//
            //ps.set(1,s.g)
        }
    }
}
