package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
class Student{
    private Long id;
    private String name;

    private Double percentage;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getPercentage() {
        return percentage;
    }

    public Student(Long id, String name, Double percentage) {
        this.id = id;
        this.name = name;
        this.percentage=percentage;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", percentage=" + percentage +
                '}';
    }
}
public class StreamApiDemo1 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1L,"A1",75d));
        students.add(new Student(2L,"A2",60d));
        students.add(new Student(3L,"A3",45d));
        students.add(new Student(4L,"A4",72d));
        students.add(new Student(5L,"A4",65d));
        //without stream
        for (Student str3:students) {
            if (str3.getPercentage() > 70) {
                System.out.println("Student Name: " + str3.getName());
                System.out.println("Student percentage: " + str3.getPercentage());
            }
        }
        //Java 8
       List<Student> stud = students
                .stream()
                .filter(p -> p.getPercentage() > 70)
                .collect(Collectors.toList());

       List<String> studNames =  students.stream().filter(p->p.getPercentage() > 70)
                        .map(Student :: getName)
                                .collect(Collectors.toList());
       List<Long> studIds = students.stream().filter(p -> p.getPercentage() > 70)
                       .map(Student :: getId)
                               .collect(Collectors.toList());
        System.out.println(stud);

    }
}
