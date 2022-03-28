package collection;

import stringdemo.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * add()
 * addAll()
 * remove()
 * removeAll()
 * clear()
 * retain()
 * retainAll()
 */
public class CollectionDemo {
    public static void main(String[] args) {
//        Student stud[] = new Student[1000];
//        stud[0] = {};
//        .
//        .
//        .
//        .
//        stud[999] = {};
//        stud[1000] = {}; // fixed size
        Collection<Integer> values = new ArrayList();
        values.add(100);
        values.add(200);
        values.add(300);
        //values.add(1,500);
        System.out.println(values);

        List<String> cities = new ArrayList();
        cities.add("Pune");
        cities.add("Mumbai");
        cities.add("Goa");
        cities.add(1,"Nagpur");
        //1st way
        Iterator iterator = cities.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //2nd way
        //Enhanced for loop
        for (String str : cities){
            System.out.println(str);
        }
        //3rd way Java 8
        cities.forEach(System.out::println);
    }
}
