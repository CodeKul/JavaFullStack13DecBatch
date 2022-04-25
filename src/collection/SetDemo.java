package collection;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> cities = new HashSet<>();
        System.out.println(cities.add("Pune"));
        System.out.println(cities.add("Mumbai"));
        System.out.println(cities.add("Chennai"));
        System.out.println(cities.add("Pune"));
        System.out.println(cities.add(null));
        System.out.println("Set: "+cities);
        Set<String> minorCities = new HashSet<>();
        minorCities.add("Goa");
        minorCities.add("Div");
        minorCities.add("Daman");
        //union of two sets
        minorCities.addAll(cities);
        System.out.println("Set after union " +minorCities);
       //intersection of two sets
        minorCities.retainAll(cities);
        System.out.println("Set after intersection "+minorCities);

        minorCities.containsAll(cities);
        System.out.println("Subset " +minorCities );
        System.out.println("contains: "+cities.contains("Pune"));

        Iterator iterator = cities.iterator();
        while (iterator.hasNext()){
            System.out.println("Iterator: "+iterator.next());
        }

        List<String> countries = new ArrayList<>();
        countries.add("India");
        countries.add("USA");
        countries.add("China");
        countries.add("Japan");
        countries.add("Japan");
        minorCities.addAll(countries);
        System.out.println("" +minorCities);
    }
}
