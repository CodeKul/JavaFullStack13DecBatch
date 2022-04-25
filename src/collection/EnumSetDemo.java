package collection;

import java.util.EnumSet;
import java.util.Iterator;

enum days{
    Sunday,Monday,Tuesday,Wednesday,Thursday,Friday,Saturday
}

public class EnumSetDemo {
    public static void main(String[] args) {
        EnumSet<days> enumSet = EnumSet.of(collection.days.Monday, collection.days.Tuesday);
        System.out.println(enumSet);
        Iterator<days> iterator = enumSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        EnumSet<days> enumSetAll = EnumSet.allOf(days.class);
        System.out.println(enumSetAll);

    }
}
