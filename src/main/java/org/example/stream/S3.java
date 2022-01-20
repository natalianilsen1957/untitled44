package org.example.stream;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.*;

public class S3 {
    public static void main(String[] args) {
//
//        Deque<Integer> deque = Stream.of(1, 2, 3, 4, 5)
//                .collect(Collectors.toCollection(ArrayDeque::new));
//
//        Set<Integer> set = Stream.of(1, 2, 3, 4, 5)
//                .collect(Collectors.toCollection(LinkedHashSet::new));
//
//
//        Map<Integer, Integer> map1 = Stream.of(1, 2, 3, 4, 5).collect(Collectors.toMap(Function.identity(),Function.identity()));
//
//        Map<Integer, String> map2 = Stream.of(1, 2, 3)
//                .collect(Collectors.toMap(Function.identity(), i -> String.format("k : v = %d : %s ", i, i+2)));
//
//        Map<Character, String> map3 = Stream.of(50, 54, 55)
//                .collect(Collectors.toMap(
//                        i -> (char) i.intValue(),
//                        i -> String.format("<%d>", i)
//                ));   // {'2'="<50>", '6'="<54>", '7'="<55>"}
//
//        Map<Integer, String> map4 = Stream.of(50, 55, 69, 20, 19, 52)
//                .collect(Collectors.toMap(
//                        i -> i % 5,
//                        i -> String.format("<%d>", i),
//                        (a, b) -> String.join(", ", a, b),  LinkedHashMap::new
//                ));
//        System.out.println(map4);
//// {0="<50>, <55>, <20>", 2="<52>", 4="<69>, <19>"}
//
//        List<Integer> listK = Stream.of(1, 2, 3, 4, 5)
//                .collect(Collectors.collectingAndThen(
//                        Collectors.toList(),
//                        Collections::unmodifiableList));
//        System.out.println(listK.getClass());
//        System.out.println(listK);
// class java.util.Collections$UnmodifiableRandomAccessList

//        List<String> list2K = Stream.of("a", "b", "c", "d")
//                .collect(Collectors.collectingAndThen(
//                        Collectors.toMap(Function.identity(), s -> s + s),
//                        map -> map.entrySet().stream()))
//                .map(e -> e.toString())
//                .collect(Collectors.collectingAndThen(
//                        Collectors.toList(),
//                        Collections::unmodifiableList));
//        list2K.forEach(System.out::println);
//// a=aa // b=bb // c=cc // d=dd
//        Stream.of("a", "b", "c", "d")
//                .collect(Collectors.collectingAndThen(
//                        Collectors.toMap(Function.identity(), s -> s + s),
//                        map -> map.entrySet().stream())).forEach(System.out::println);





    }
}
