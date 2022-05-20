package java8;

import java.util.Optional;
import java.util.function.Consumer;

public class OptionalDemo {
    public static void main(String[] args) {
        //Without Optional class
        String[] str = new String[5];
        String s = str[3].toUpperCase();
        System.out.println(s);

        String[] str1 = new String[5];
        Optional<String> checkNull = Optional.ofNullable(str1[5]);
        if (checkNull.isEmpty())
            System.out.println("String value is not present");
        else
            System.out.println(str1[3].toUpperCase());
        //ternary operator
        System.out.println(checkNull.isEmpty() ? "String value is not present" : str1[3].toUpperCase());

        checkNull.ifPresent(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        //by using lambda
        checkNull.ifPresent(s2 -> System.out.println(s2));
        checkNull.ifPresent(System.out::println);

    }
}
