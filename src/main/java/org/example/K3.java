package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class K3 {
    public static void main(String[] args) {
     List<Integer> numbers = Arrays.asList(-3, -2, -1, 0, 1, 2, 3, -4, -53, -2, -1, 0, 1, 2, 3, -4, -5);
//        numbers.stream().sorted().takeWhile(n -> n < 0).forEach(n -> System.out.println(n));
//        numbers.stream().sorted().distinct().forEach(System.out::println);
//
//        Stream<Integer> numbers = Stream.of(-3, -2, -1, 0, 1, 2, 3, -4, -5);
//        numbers.stream().sorted().dropWhile(n -> n < 0)
//                .forEach(n -> System.out.println(n));
//        System.out.println(numbers);
//
//        numbers.stream().filter(x->x>0).map(x-> x*x).sorted().forEach(System.out::println);
//        List<String> names = Arrays.asList("Reflection","Collection","Stream");
//        List <String> result = names.stream().filter(s->s.startsWith("S")).collect(Collectors.toList());
//
//        List<Integer> number = Arrays.asList(2,3,4,5,3);
//        Set<Integer> square = number.stream().map(x->x*x).collect(Collectors.toSet());
//        https://www.geeksforgeeks.org/stream-in-java/#_=_
//
//   Integer [] arrA={1,2,3,4,5,6};
//
//        Arrays.stream(arrA).map(x->x*x).forEach(y->System.out.println(y));
// creating a list of Strings
        List<String> words = Arrays.asList("K10", "Geeks", "for",
                "GeeksQuiz", "GeeksforGeeks");

        // The lambda expression passed to
        // reduce() method takes two Strings
        // and returns the longer String.
        // The result of the reduce() method is
        // an Optional because the list on which
        // reduce() is called may be empty.
        Optional<String> longestString = words.stream()
                .reduce((word1, word2)
                        -> word1.length() > word2.length()
                        ? word1 : word2);
        longestString.ifPresent(System.out::println);

        String[] array = { "Geeks", "for", "Geeks" };
        Optional<String> String_combine = Arrays.stream(array)
                .reduce((str1, str2)
                        -> str1 + "-" + str2);
        if (String_combine.isPresent()) {
            System.out.println(String_combine.get());
        }

        List<Integer> arrayS = Arrays.asList(-2, 0, 4, 6, 8);
        int sum = arrayS.stream().reduce(0,
                (element1, element2) -> element1 + element2);
        System.out.println(sum);

        int product = IntStream.range(2, 8)
                .reduce((num1, num2) -> num1 * num2)
                .orElse(-1);
        System.out.println("The product is : " + product);

    }
}
