package collection;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        List<String> fruits = new LinkedList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Kiwi");
        fruits.add("Water Melon");
        System.out.println("Linked List: "+fruits);
        fruits.add(1,"Grapes");
        System.out.println("Updated List "+fruits);
        System.out.println("Element at index "+fruits.get(2));
        fruits.set(3,"Avocado");
        System.out.println("Updated List after set "+fruits);
        System.out.println("Removed Element: "+fruits.remove(4));
        System.out.println("Updated List after remove "+fruits);

    }
}
