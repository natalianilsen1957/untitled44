package org.example;
// Java program to demonstrate
// computeIfAbsent(Key, Function) method.

import java.util.*;

public class K13 {

    // Main method
    public static void main(String[] args) {

        // create a HashMap and add some values
        HashMap<Integer, String>
                map1 = new HashMap<>();
        map1.put(1, "L");
        map1.put(2, "M");
        map1.put(3, "N");

        HashMap<Integer, String>
                map2 = new HashMap<>();
        map2.put(1, "B");
        map2.put(2, "G");
        map2.put(3, "R");

        // print map details
        System.out.println("HashMap1: "
                + map1.toString());

        System.out.println("HashMap2: "
                + map2.toString());

        // provide value for new key which is absent
        // using computeIfAbsent method
      map2.forEach((key, value) -> map1.merge(key,value,(v1,v2)->v1.equalsIgnoreCase(v2) ? v1 : v1+" "+v2));
        System.out.println("New HashMap: " + map1);
        System.out.println(map1.get(2));
    }
}
