package org.example;

import java.util.*;

class MySolution {
    public static void main(String[] args) {
//        String[] numbers = {"Франция", "Германия", "Монако", "Испания", "Италия", "Австрия", "Испания", "Монако", "Грузия", "Монако", "Испания", "Италия", "Монако", "Сингапур", "Армения"};
        Set<String> point2 = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        String[] numbers = sc.nextLine().trim().split(" ");
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < numbers.length; i++) {
            String word = numbers[i];
            if (!map.containsKey(word)) {
                map.put(word, 1);
            } else {
                map.put(word, map.get(word) + 1);
            }
        }
        for (String o : map.keySet()) {
            if (map.get(o).equals(1)) {
                point2.add(o);
            }
        }

        for (String el1 : numbers) {
            if (point2.contains(el1)) {
                System.out.print(el1 + "");
            }

        }
    }
}



