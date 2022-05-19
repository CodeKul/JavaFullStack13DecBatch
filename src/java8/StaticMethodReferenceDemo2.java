package java8;

import java.util.function.BiFunction;

class Addition {
    public static int add(Integer n1, Integer n2) {
        return n1 + n2;
    }
}

public class StaticMethodReferenceDemo2 {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> adder = Addition::add;
        Integer result = adder.apply(10, 15);
        System.out.println("Result " + result);
    }
}
