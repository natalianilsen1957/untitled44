package org.example;

import java.util.*;

public class Map1 {
    public static void main(String[] args) {
        Map<Integer, List<String>> map = new HashMap<Integer, List<String>>();
//        if (map.containsKey(key))

        List<String> valSetOne = new ArrayList<String>();
        valSetOne.add("ABC");

        List<String> valSetTwo = new ArrayList<String>();
        valSetTwo.add("CBA");

        map.put(1, valSetOne);
        map.put(2, valSetTwo);

        for (Map.Entry<Integer, List<String>> entry : map.entrySet()) {

            Integer key = entry.getKey();

            List<String> values = entry.getValue();

            System.out.println("Value of " + key + " is " + values);

        }
    }}