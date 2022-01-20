package org.example;

import java.util.List;

public class q11 {
    public static void main(String[] args) {

        System.out.println("### TESTING listOF with mutable content ###");

        StringBuilder one = new StringBuilder();
        one.append("a1");

        StringBuilder two = new StringBuilder();
        two.append("a2");


        List<StringBuilder> asList1 = List.of(one, two);
        System.out.println(asList1);
        System.out.println(asList1.get(0).toString());
        asList1.get(0).append("123");
        asList1.get(1).append("999");
        System.out.println(asList1.get(0).toString());
        System.out.println(asList1);
    }
}
