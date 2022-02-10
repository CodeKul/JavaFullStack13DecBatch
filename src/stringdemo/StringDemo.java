package stringdemo;

import java.util.ArrayList;
import java.util.List;

public class StringDemo {
    int a = 10;//instance variable - Heap
    static int b = 20; //static variable - Method Area

    public static void main(String[] args) {
        //char array
        int c = 30;//local variable - stack
        char[] ch = {'J', 'A', 'V', 'A'};
        String str1 = String.valueOf(ch);

        //String literal
        String str2 = "Java";

        //by new keyword
        String str3= new String("Java"); //Heap Area
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

    }
}
