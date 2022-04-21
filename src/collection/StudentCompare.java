package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentCompare {
    private Integer rollNo;
    private String name;
    private Integer age;

    public StudentCompare(Integer rollNo, String name, Integer age) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
    }

    public Integer getRollNo() {
        return rollNo;
    }

    public void setRollNo(Integer rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "StudentCompare{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class AgeComparator implements Comparator<StudentCompare>{
    @Override
    public int compare(StudentCompare s1, StudentCompare s2) {
        if (s1.getAge() == s2.getAge())
        return 0;
        else if(s1.getAge() < s2.getAge())
            return -1;
        else
            return 1;
    }
}
class NameComparator implements Comparator<StudentCompare>{

    @Override
    public int compare(StudentCompare o1, StudentCompare o2) {
       return o1.getName().compareTo(o2.getName());
    }
}

class StudentCompareImpl{
    public static void main(String[] args) {
        ArrayList<StudentCompare> studentCompares = new ArrayList<>();
        studentCompares.add(new StudentCompare(1,"Vijay",25));
        studentCompares.add(new StudentCompare(2,"Savita",27));
        studentCompares.add(new StudentCompare(3,"Anit",31));
        studentCompares.add(new StudentCompare(4,"Vijay",24));
        studentCompares.add(new StudentCompare(5,"Jyoti",23));
        System.out.println("Sorting by using name");
        Collections.sort(studentCompares,new NameComparator());
        for (StudentCompare s : studentCompares){
            System.out.println(s.toString());
        }
        System.out.println("Sorting by using age");
        Collections.sort(studentCompares,new AgeComparator());
        for (StudentCompare a : studentCompares){
            System.out.println(a.toString());
        }
    }
}