package collection;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        SortedSet<Integer> values = new TreeSet<>();
        values.add(87);
        values.add(25);
        values.add(68);
        values.add(72);
        values.add(5);
        values.add(101);
        System.out.println("Sorted Set "+values);
        Set<Integer> evenValues = new TreeSet<>();
        evenValues.add(2);
        evenValues.add(10);
        evenValues.add(8);
        values.addAll(evenValues);
        System.out.println(values);
    }
}
