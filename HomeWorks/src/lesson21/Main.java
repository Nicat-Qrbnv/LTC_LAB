package lesson21;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Map demo with LinkedHasMap
        Map <String, Integer> cities = new HashMap<>();
        cities.put("City1", 100);
        cities.put("City2", 300);
        cities.put("City3", 120);

        for (Map.Entry <String, Integer> entry : cities.entrySet()) {
            System.out.println (entry);
        }
        System.out.println ();

        //some Map methods
        cities.put ("City4", 500);
        System.out.println (cities);
        System.out.println ();

        int distance1 = cities.get("City1");
        System.out.println ("City1 --> " + distance1);
        System.out.println ();

        Set<String> distances = cities.keySet();
        System.out.println (distances);
        System.out.println ();

        cities.putIfAbsent("City2", 250);
        System.out.println (cities);
        System.out.println ();

        cities.remove("City2");
        cities.putIfAbsent("City2", 250);
        System.out.println (cities);
        System.out.println ();

        System.out.println (cities.containsValue(120));
        System.out.println ();


    }
}
