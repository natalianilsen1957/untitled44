package org.example.stream;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.*;

public class S4 {
    public static void main(String[] args) {
//
//        String s1 = Stream.of("a", "b", "c", "d")
//                .collect(Collectors.joining());
//        System.out.println(s1);
//// abcd
//        String s2 = Stream.of("a", "b", "c", "d")
//                .collect(Collectors.joining("-"));
//        System.out.println(s2);
//// a-b-c-d
//        String s3 = Stream.of("a", "b", "c", "d")
//                .collect(Collectors.joining(" -> ", "[ ", " ]"));
//        System.out.println(s3);
//// [ a -> b -> c -> d ]
//
//        Integer sum = Stream.of("1", "2", "3", "4")
//                .collect(Collectors.summingInt(Integer::parseInt));
//        System.out.println(sum);
//// 10
//
//        Double average = Stream.of("1", "2", "3", "4")
//                .collect(Collectors.averagingInt(Integer::parseInt));
//        System.out.println(average);
//// 2.5
//
//        DoubleSummaryStatistics statsD = Stream.of("1.1", "2.34", "3.14", "4.04")
//                .collect(Collectors.summarizingDouble(Double::parseDouble));
//        System.out.println(statsD);
////// DoubleSummaryStatistics{count=4, sum=10.620000, min=1.100000, average=2.655000, max=4.040000}
//
//        LongSummaryStatistics statsL = Stream.of("1.1", "2.34", "3.14", "4.04")
//                .collect(Collectors.summarizingLong(Long::parseLong));
//        System.out.println(statsL);
//
//        Integer sumI = Stream.of("1", "2", "3", "4").collect(Collectors.summingInt(Integer::parseInt);
//        Double averI = Stream.of("1", "2", "3", "4").collect(Collectors.averagingDouble(Double::parseDouble);
//        Long count = Stream.of("1", "2", "3", "4").collect(Collectors.counting());
//
//        LongSummaryStatistics longSummaryStatistics=LongStream.range(2,10).summaryStatistics();
//        System.out.printf("%s", longSummaryStatistics.toString());
//
//        List<Integer> intsC1 = Stream.of(1, 2, 3, 4, 5, 6)
//                .collect(Collectors.filtering(
//                        x -> x % 2 == 0,
//                        Collectors.toList()));
//// 2, 4, 6
        List<Integer> intsC2 = Stream.of(1, 2, 3, 4, 5, 6).collect(Collectors.filtering(x -> x % 2 == 0, Collectors.toList()));
        System.out.println(intsC2);
// 2, 4, 62

        String s1 = Stream.of(1, 2, 3, 4, 5, 6)
                .collect(Collectors.filtering(x-> x%2==0, Collectors.mapping(x->Integer.toString(x), Collectors.joining(", ") )));
//        String s2Fl = Stream.of(2, 0, 1, 3, 2)
//                .collect(Collectors.f(x->IntStream.range(0,x).mapToObj(Integer::toString), Collectors.joining(", "));
//                        System.out.println(s2Fl);
// 0, 1, 0, 0, 1, 2, 0, 1
//

//        String valueR1 = Stream.of(1, 2, 3, 4)
//                .collect(Collectors.reducing("",x->Integer.toString(x),(a,b)->a+b));
//        System.out.println(valueR1);
//        int s3R1 = Stream.of(1, 2, 3, 4, 5, 6)
//                .collect(Collectors.reducing(
//                        10, (a, b) -> a + b
//                ));
//        System.out.println(s3R1);
//
//

    }
}
