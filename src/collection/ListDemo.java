package collection;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> countries = new ArrayList<>();
        countries.add("India");
        countries.add("USA");
        countries.add("China");
        countries.add("Japan");
        countries.add("Japan");
        System.out.println(countries);
        countries.remove("China");
        System.out.println(countries);
        countries.add(1,"Shri-lanka");
        System.out.println(countries);
        System.out.println("Size is "+countries.size());
        System.out.println("IsEmpty "+countries.isEmpty());
        System.out.println(countries.contains("Japan"));
    }
}
