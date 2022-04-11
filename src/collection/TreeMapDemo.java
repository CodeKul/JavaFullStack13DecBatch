package collection;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        SortedMap<Integer,String> sortedMap = new TreeMap<>();
        sortedMap.put(103,"Amit");
        sortedMap.put(102,"Ravi");
        sortedMap.put(101,"Viraj");
        sortedMap.put(104,"Sanket");
        sortedMap.put(100,"Rahul");
        for (Map.Entry<Integer,String> entry : sortedMap.entrySet()){
            System.out.println(entry.getKey() +" : "+entry.getValue());
        }
    }
}
