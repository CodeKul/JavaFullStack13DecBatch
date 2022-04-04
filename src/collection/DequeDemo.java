package collection;

import java.util.Deque;
import java.util.LinkedList;

public class DequeDemo {
    public static void main(String[] args) {
        Deque<String> lang = new LinkedList<>();
        lang.addFirst("C");
        System.out.println("Add First:  "+lang);
        lang.offerFirst("C++");
        System.out.println("Offer First: "+lang);
        lang.addLast("Java");
        System.out.println("Add Last:"+lang);
        lang.offerLast("PHP");
        System.out.println("Offer Last:"+lang);
        lang.add("React JS");
        lang.add("Python");
        lang.add("Swift");
        System.out.println("Elements are "+lang);

    }
}
