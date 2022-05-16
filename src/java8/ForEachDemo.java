package java8;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ForEachDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        list.add(16);
        list.add(17);
        //traversing an array
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next());
        }

        //java 8
        System.out.println();
        list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer i) {
                System.out.print(i);
            }
        });
        //consumer implementation
        TestConsumer testConsumer = new TestConsumer();
        list.forEach(testConsumer);

        Map<String,String> map = new HashMap<>();
        map.put("1","C");
        map.put("2","C++");
        map.put("3","Java");
        map.put("4","JavaScript");
        map.put("5","Python");
        //Before Java 8
        for (Map.Entry<String,String> m : map.entrySet()){
            System.out.println("Key: "+m.getKey() + " Value: "+m.getValue());
        }
        //Java 8
        System.out.println("Java 8");
        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String s, String s2) {
                System.out.println("Key: "+s + " Value: "+s2);
            }
        });
    }
}

class TestConsumer implements Consumer<Integer>{
    @Override
    public void accept(Integer n) {
        System.out.println("Value = "+n);
    }
}