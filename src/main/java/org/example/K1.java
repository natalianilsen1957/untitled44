package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class K1
{
    public static void main(String[] args)
    {
        Map<String, String> books = new HashMap<>();
        books.put(
                "978-0201633610", "Design patterns : elements of reusable object-oriented software");
        books.put(
                "978-1617291999", "Java 8 in Action: Lambdas, Streams, and functional-style programming");
        books.put("978-0134685991", "Effective Java");

        System.out.println(books);

        Optional<String> optionalIsbn = books.entrySet().stream()
                .filter(e -> "Effective Java".equals(e.getValue()))
                .map(Map.Entry::getKey)
                .findFirst();

//        assertEquals("978-0134685991", optionalIsbn.get());



    }
}