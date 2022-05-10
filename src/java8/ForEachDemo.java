package java8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
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
    }
}

class TestConsumer implements Consumer<Integer>{
    @Override
    public void accept(Integer n) {
        System.out.println("Value = "+n);
    }
}