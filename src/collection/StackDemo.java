package collection;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> animals = new Stack<>();
        animals.push("Dog");
        animals.push("Lion");
        animals.push("Cat");
        animals.push("Horse");
        System.out.println("Original Stack "+animals);
        System.out.println("Removed Element: "+animals.pop());
        System.out.println("After popping Stack: "+animals);
        System.out.println(("Peek " + animals.peek())); // return element from top of the stack
        int position =  animals.search("Dog"); // returns the position of the element from the top of the stack
        System.out.println("Position "+position);
        System.out.println(animals.empty());

    }
}
