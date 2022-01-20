package org.example.stream;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.*;

public class S2 {
    public static void main(String[] args) {
//        Stream.of("10", "30", "90")
//    .map(x -> Integer.parseInt(x, 16))
//    .forEach(System.out::println);
//
//        Stream.of(1,0,4)
//                .flatMapToInt(x -> IntStream.range(0, x))
//                .forEach(System.out::println);
//
//                Stream.of(1, 2, 3, 4, 5, 6)
//                .flatMap(x -> {
//                    switch (x % 3) {
//                        case 0:
//                            return Stream.of(x, x * x, x * x *x);
//                        case 1:
//                            return Stream.of(x);
//                        case 2:
//                        default:
//                            return Stream.empty();
//                    } } ).forEach(System.out::println);
//
//        Stream.of(1, 2, 3, 4, 5, 6)
//                .mapMulti((x, consumer) -> {
//                    if (x % 2 == 0) {
//                        consumer.accept(-x);
//                        consumer.accept(x);
//                    }
//                }).forEach(System.out::println);
//
//              IntStream.range(0, 10)
//                .skip(5)
//                .limit(3)
//                .skip(1)
//                .forEach(System.out::println);
//
//        IntStream.concat(
//                        IntStream.range(0, 6),
//                        IntStream.of(-1, -2))
//                .sorted()
//                .limit(5)
//                .forEach(System.out::println);
//
//        Stream.of(120, 410, 85, 32, 314, 12).sorted(Comparator.reverseOrder()).forEach(System.out::println);
//
//
//        Stream.of(0, 3, 0, 0, 5)
//                .peek(x -> System.out.format("before distinct: %d%n", x))
//                .distinct()
//                .peek(x -> System.out.format("after distinct: %d%n", x))
//                .map(x -> x * x)
//                .forEach(x -> System.out.format("after map: %d%n", x));
//
//        Stream.of(1, 2, 3, 4, 2, 5)
//                .takeWhile(x -> x < 3)
//                .forEach(System.out::println);
//
//        IntStream.of(1, 3, 2, 0, 5, 4)
//                .dropWhile(x -> x%2 == 1)
//                .forEach(System.out::println);
//
//        DoubleStream.of(0.1, Math.PI)
//                .boxed()
//                .map(Object::getClass)
//                .forEach(System.out::println);
//
//        Stream.of(120, 410, 85, 32, 314, 12)
//                .forEach(x -> System.out.format("%s, ", x));
//
//        IntStream.range(0, 100000)
//                .parallel()
//                .filter(x -> x % 10000 == 0)
//                .map(x -> x / 10000)
//                .forEachOrdered(System.out::println);
//
//        long count = IntStream.range(0, 10)
//                .flatMap(x -> IntStream.range(0, x))
//                .count();
//        System.out.println(count);
//
//        String sQ = Stream.of(1, 2, 3)
//                .map(String::valueOf)
//                .collect(Collectors.joining("-", "<", ">"));
//        System.out.println(sQ);
//
//        List<String> listL = Stream.of("a", "b", "c", "d")
//                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
//        System.out.println(listL);
//
//        String[] elementsA = Stream.of("a", "b", "c", "d").map(String::toUpperCase)
//                .toArray(String[]::new);
//        System.out.println(Arrays.toString(elementsA));
//
//        long count = IntStream.range(0, 10)
//                .flatMap(x -> IntStream.range(0, x))
//                .count();
//        System.out.println(count);
//
//        Stream.of(1, 2, 3, 4, 5, 6)
//                .mapMulti((x, cR1) -> {
//                    if (x % 2 == 0) {
//                        cR1.accept(-x);
//                        cR1.accept(x);
//                    }
//                }).forEach(x-> System.out.printf("%d, ", x));
//
//        int sumD = Stream.of(1, 2, 3, 4, 5)
//                .reduce(10, (sumE, x) -> sumE + x);
//        System.out.println(sumD);
//
//        int product = IntStream.range(1, 10)
//                .filter(x -> x % 3 == 0)
//                .reduce((acc, x) -> acc * x).getAsInt();
//        System.out.println(product);
//
//        int minF = Stream.of(20, 11, 45, 78, 13)
//                .min(Integer::compare).get();
//        int maxF = Stream.of(20, 11, 45, 78, 13)
//                .max(Integer::compare).get();
//        System.out.printf("minF %d, maxF  %d", minF,maxF);
//
//        int anySeq = IntStream.range(4, 12)
//                .findAny()
//                .getAsInt();
//        int firstSeq = IntStream.range(4, 12)
//                .findFirst()
//                .getAsInt();
//
//        boolean resultA = Stream.of(1, 2, 3, 4, 5)
//                .allMatch(x -> x <= 7);
//        boolean resultB = Stream.of(1, 2, 3, 4, 5)
//                .anyMatch(x -> x == 3);
//        boolean resultC = Stream.of(1, 2, 3, 4, 5)
//                .noneMatch(x -> x == 9);
//        double resultD = IntStream.range(2, 16)
//                .average()
//                .getAsDouble();
//        long result = LongStream.range(2, 16)
//                .sum();
//
//
//        LongSummaryStatistics stats = LongStream.range(2, 16)
//                .summaryStatistics();
//        System.out.format("  count: %d\n", stats.getCount());
//        System.out.format("    sum: %d%n", stats.getSum());
//        System.out.format("average: %.1f%n", stats.getAverage());
//        System.out.format("    min: %d%n", stats.getMin());
//        System.out.format("    max: %d%n", stats.getMax());
//   count: 14
//     sum: 119
// average: 8,5
//     min: 2
//     max: 15

    }
}
