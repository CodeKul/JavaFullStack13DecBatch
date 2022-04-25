package collection;

import java.util.Comparator;
import java.util.EnumMap;

class Student1{
    private Integer rollNo;
    private String name;

    public Student1(Integer rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                '}';
    }
}
enum div{
    A,B,C,D,E
}
public class StudentEnumMapDemo {
    public static void main(String[] args) {


        EnumMap<div,Student1> enumMap = new EnumMap<div, Student1>(div.class);
        Student1 s1 = new Student1(1,"Amit");
        Student1 s2 = new Student1(2,"Yash");
        Student1 s3 = new Student1(3,"Arohi");
        Student1 s4 = new Student1(4,"Suraj");
        Student1 s5 = new Student1(5,"Jay");
        enumMap.put(div.A,s1);
        enumMap.put(div.B,s2);
        enumMap.put(div.C,s3);
        enumMap.put(div.B,s4);
        enumMap.put(div.E,s5);

        System.out.println(enumMap);
    }
}
