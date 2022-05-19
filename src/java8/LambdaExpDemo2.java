package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaExpDemo2 {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple","Banana","Pomegranate","Mango","Chikoo");
      //  System.out.println(fruits);
        //anonymous
        fruits.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        //lambda
        fruits.forEach(str -> System.out.println(str));

        //method reference
        fruits.forEach(System.out :: println);
    }
}
