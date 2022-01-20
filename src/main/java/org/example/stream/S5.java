package org.example.stream;

import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.*;


public class S5 {
    public static void main(String[] args) {
        String[] arguments = {"-i", "in.txt", "--limit", "40", "-d", "1", "-o", "out.txt"};
        Map<String, String> mapHH = new LinkedHashMap<>();
        for (int i = 0; i < arguments.length; i += 2) {
            mapHH.put(arguments[i], arguments[i + 1]);
        }
//        mapHH.forEach((k, v) -> System.out.println(k + ":" + v + "\t"));

        String[] argsJJ = mapHH.entrySet().stream().flatMap(e->Stream.of(e.getKey(), e.getValue())).toArray(String []::new);
        System.out.println(Arrays.toString(argsJJ));
        System.out.println(String.join(" ", argsJJ));
    }
}