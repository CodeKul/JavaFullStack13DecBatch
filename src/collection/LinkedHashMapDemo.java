package collection;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(33,"Abhay");
        linkedHashMap.put(11,"Shobha");
        linkedHashMap.put(24,"Jim");
        linkedHashMap.put(1,"Jay");
        linkedHashMap.put(100,"Cherry");
        System.out.println(linkedHashMap);

        //iterator
       Set<Map.Entry<Integer,String>> set =  linkedHashMap.entrySet();
        System.out.println("set: "+set);

        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            Map.Entry entry = (Map.Entry) iterator.next();
            System.out.print("Keys "+entry.getKey());
            System.out.print(" Values "+entry.getValue());
            System.out.println();
        }

        for (Map.Entry<Integer,String> entry : linkedHashMap.entrySet()){
            System.out.print("Keys "+entry.getKey());
            System.out.print(" Values "+entry.getValue());
            System.out.println();
        }

        System.out.println("Get Keys: "+linkedHashMap.keySet());
        System.out.println("Get Values: "+linkedHashMap.values());
        //returns the value of associated with specified key, if key is not found,it returns specified default value
        System.out.println(linkedHashMap.getOrDefault(1,"Rocky"));
    }
}
