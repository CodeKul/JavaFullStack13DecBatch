package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Developer implements Comparable<Developer>{
    private String name;
    private Integer salary;
    private String mobile;

    public Developer(String name, Integer salary, String mobile) {
        this.name = name;
        this.salary = salary;
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", mobile='" + mobile + '\'' +
                '}';
    }

    @Override
    public int compareTo(Developer d) {
        return salary.compareTo(d.salary);
    }
}

class DeveloperSortingImpl{
    public static void main(String[] args) {
        ArrayList<Developer> developers = new ArrayList<>();
        developers.add(new Developer("Ajay",5000,"9865321452"));
        developers.add(new Developer("Akash",9000,"9865331452"));
        developers.add(new Developer("zoe",7000,"9865311452"));
        Collections.sort(developers);
        System.out.println("Sorted List");
        for (Developer d : developers){
            System.out.println(d.toString());
        }
    }
}