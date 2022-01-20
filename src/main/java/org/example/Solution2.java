package org.example;

import java.util.*;

class Solution2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num6 = scan.nextInt();
        HashMap<Integer, Integer> colors = new HashMap<Integer, Integer>();

        while(num6-- > 0) {
            System.out.println(num6);
            int c = scan.nextInt();
            Integer frequency = colors.get(c);

            // If new color, add to map
            if(frequency == null) {
                colors.put(c, 1);
            }
            else { // Increment frequency of existing color
                colors.put(c, frequency + 1);
            }
        }
        scan.close();
        System.out.println(colors);
//        HashMap<Integer, Integer> d1 = new HashMap<Integer, Integer>();
//        d1.put(1,20);
//        d1.put(5,4);
//        d1.put(2,0);
//        d1.put(3,0);
//        d1.put(4,0);
//        System.out.println(d1);
//        int pairs = 0;
//        for(Integer el1 : d1.values()) {
//            pairs += el1;
//            System.out.println(el1);
//            System.out.println(pairs);
//        }

    }
}

