package org.example.IO777;

import java.util.Arrays;
import java.util.Properties;

public class Properties1 {
    public static void main(String[] args) {
        Arrays.stream(args).forEach(System.out::println);
        Properties properties = System.getProperties();
        properties.list(System.out);

    }
}
