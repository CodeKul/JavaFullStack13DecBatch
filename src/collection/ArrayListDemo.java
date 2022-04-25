package collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListDemo {
    public static void main(String[] args) {
        int a[] = new int[5];
        ArrayList<Integer> values = new ArrayList<>();
        values.add(10);
        values.add(20);
        values.add(30);
        values.add(40);
        values.add(50);
        System.out.println("ArrayList: "+values);
        System.out.println("Element @index 2: "+values.get(2));
        values.set(2,60);
        System.out.println("Modified ArrayList: "+values);
        System.out.println("Removed Element: " +values.remove(4));
        System.out.println("Modified ArrayList: "+values);
        for (Integer n : values){
            System.out.println(n);
        }

    }
}
