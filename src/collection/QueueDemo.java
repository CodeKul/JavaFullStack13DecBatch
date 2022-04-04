package collection;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> values = new PriorityQueue<>();
        values.add(2);
        values.add(65);
        values.add(48);
        values.add(5);
        values.add(22);
        System.out.println("Queue: "+values);
        values.offer(21);
        System.out.println("After offer "+values);
        System.out.println("Element:"+values.element());
        System.out.println("Peek:"+values.peek());
        System.out.println("Remove: "+values.remove());
        System.out.println("Poll: "+values.poll());
        System.out.println("Remaining Queue is "+values);
    }
}
