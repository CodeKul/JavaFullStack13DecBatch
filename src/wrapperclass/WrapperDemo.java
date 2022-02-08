package wrapperclass;

import java.util.List;

/**
 * The wrapper class in Java provides the mechanism to convert primitive into object and object into primitive.
 *
 * From JDK - 1.0
 * int- Integer
 * float-Float
 * double-Double
 * long-LOng
 * char- Character
 * boolean-Boolean
 * byte - Byte
 *
 * //used in collections
 * 99.99% object oriented language
 */
public class WrapperDemo {
    public static void main(String[] args) {
        Integer i = 3;
        System.out.println(i);
        int ii = i.intValue();//converting wrapper class value to primitive - autoboxing
        ii = i;
        int j = 5;
        Integer jj = Integer.valueOf(j);// converting primitive value to wrapper class - unboxing
        jj = j;
        System.out.println(ii);
    }
}
