package collection;

import java.util.EnumMap;
enum months{
    Jan,Feb,Mar,Apr,May,Jun,Jul,Aug,Sept,Oct,Nov,Dec
}
public class EnumMapDemo {
    public static void main(String[] args) {
        EnumMap<months,String> enumMap = new EnumMap<months, String>(months.class);
        enumMap.put(months.Jan,"January");
        enumMap.put(months.Feb,"February");
        System.out.println(enumMap);
        System.out.println("contains key "+enumMap.containsKey(months.Apr));
    }
}
