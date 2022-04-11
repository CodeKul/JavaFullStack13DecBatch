package collection;

import java.util.LinkedHashMap;

public class Person {
    private Integer empId;
    private String empName;
    private String companyName;

    public Person(){}
    public Person(Integer empId, String empName, String companyName) {
        this.empId = empId;
        this.empName = empName;
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}

class PersonMapImpl{
    public static void main(String[] args) {
        LinkedHashMap<Integer,Person> personMap = new LinkedHashMap<>();
        Person p1 = new Person(101,"Pallavi Patil","Codekul");
        Person p2 = new Person(102,"Jyoti Sen","Codekul");
        Person p3 = new Person(103,"Ruchita Pawar","Codekul");
        personMap.put(101,p1);
        personMap.put(102,p2);
        personMap.put(103,p3);
        System.out.println(personMap);

    }
}