package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * ... varargs - variable args
 */
public class CollectionsDemo {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();
        animals.add("Zebra");
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Gorilla");
        animals.add("Dog");
        //add  methods
        System.out.println("Original: "+animals);
        Collections.addAll(animals,"Cat","Rat","Buffalo");
        System.out.println("After AddAll: "+animals);
        //sort
        Collections.sort(animals);
        System.out.println("Sorted Order:  "+animals);

        //search item
        System.out.println("index of Gorilla:  "+Collections.binarySearch(animals,"Gorilla"));

        System.out.println("index of Horse:  "+Collections.binarySearch(animals,"Horse"));
        //reverse order
         Collections.sort(animals,Collections.reverseOrder());
        System.out.println("Reverse Order: "+animals);
    }
}
