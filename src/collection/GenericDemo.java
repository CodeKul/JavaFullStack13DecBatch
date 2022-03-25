package collection;

import java.util.ArrayList;
import java.util.List;

public class GenericDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
     //   list.add("abc"); //compile time error
        list.add(1);
        //list.add("5");
   //     list.add(8.5); ////compile time error
    //    list.add(true);//compile time error
    }
}
