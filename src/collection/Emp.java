package collection;

import java.util.ArrayList;
import java.util.Collections;

public class Emp implements Comparable<Emp>{
    private String name;

    public Emp(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Emp o) {
        return name.compareTo(o.name);
    }
}

class EmpSortImpl{
    public static void main(String[] args) {
        ArrayList<Emp> emps = new ArrayList<>();
        emps.add(new Emp("Saurav"));
        emps.add(new Emp("Trupti"));
        emps.add(new Emp("Aayesh"));
        emps.add(new Emp("Jack"));
        Collections.sort(emps);
        for (Emp e:emps){
            System.out.println(e.getName());
        }
    }
}