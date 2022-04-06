package collection;

import java.util.Deque;
import java.util.LinkedList;

public class DequeLinkedListDemo {
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
        System.out.println("Peek First: "+lang.peekFirst());
        System.out.println("Get First: "+lang.getFirst()); //throws NoSuchElementException if this deque is empty
        System.out.println("peek last: "+lang.peekLast());
        System.out.println("get last: "+lang.getLast());//throws NoSuchElementException if this deque is empty
        System.out.println("Poll first: "+lang.pollFirst());
        System.out.println("Elements are "+lang);
        System.out.println("remove first: "+lang.removeFirst()); //throws NoSuchElementException if this deque is empty
        System.out.println("Elements are "+lang);
        System.out.println("Poll Last: "+lang.pollLast());
        System.out.println("Elements are "+lang);
        System.out.println("remove Last: "+lang.removeLast());//throws NoSuchElementException if this deque is empty
        System.out.println("Remaining Elements are "+lang);

    }
}
