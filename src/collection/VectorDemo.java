package collection;

import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<String> mammals = new Vector<>();
        mammals.add("Dog");
        mammals.add("Horse");
        mammals.add(2,"Cat");
        System.out.println("Vector: "+mammals);
        System.out.println("Element at index 1: "+ mammals.get(1));
        Iterator iterator = mammals.iterator();
        while (iterator.hasNext()){
            System.out.println("Element "+iterator.next());
        }
        System.out.println("Element removed: "+mammals.remove(1));
        System.out.println("Size "+mammals.size());

    }
}
