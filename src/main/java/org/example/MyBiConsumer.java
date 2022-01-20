package org.example;

import java.util.function.BiConsumer;

class MyBiConsumer implements BiConsumer<String, Integer> {

    public void accept(String k, Integer v) {
        System.out.print("Key = " + k);
        System.out.print("\t Value = " + v);
        System.out.println();
    }
}