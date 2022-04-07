package collection;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Komal");
        map.put(2,"Meena");
        map.put(3,"Deepak");
        map.put(4,"Raju");
        map.put(5,"Sonal");
        map.put(4,"ketki");
        map.put(6,"Meena");
        map.put(null,null);
        map.put(7,null);
        System.out.println(map);

        System.out.println("Get "+map.get(5));
        System.out.println("replace old value: "+map.replace(7,null,"Joe"));
        System.out.println("Elements "+map);
        System.out.println("replace "+map.replace(2,"Ravi"));
        System.out.println("Elements "+map);
        //iterate

    }
}
