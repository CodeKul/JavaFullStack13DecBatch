package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo1 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<String> list3 = new ArrayList<>();
        list3.add("");
        list3.add("");
        list3.add("a");
        list3.add("");
        list3.add("a");
        list1.add("Shoes");
        list1.add("Toys");
        list1.add("Chairs");
        list1.add("TV");

        list2.add("Table");
        list2.add("Glass");
        list2.add("Boards");
        list2.add("Freeze");

        Collections.copy(list3,list2);
        System.out.println(list3);
        System.out.println(Collections.disjoint(list1,list2));

    }
}
