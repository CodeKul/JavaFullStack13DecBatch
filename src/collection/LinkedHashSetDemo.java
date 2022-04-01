package collection;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> names = new LinkedHashSet<>();
        names.add("Rohan");
        names.add("Rahul");
        names.add("Dev");
        names.add("Dev");
        names.add("Amit");
        names.add("Meena");
        System.out.println("Set "+names);
    }
}
