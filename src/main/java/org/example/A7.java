package org.example;

import java.util.ArrayList;
import java.util.Arrays;

class A7{
    public static void main(String[] args) {

String[] simpleStringArray = { "a", "c", "e" };
        ArrayList<String> newArrayList = new ArrayList<String>(
        Arrays.asList(simpleStringArray));

        String[] arr1 = new String[newArrayList.size()];
        newArrayList.toArray(arr1);
        for (String element : arr1) {
        System.out.println(element);
        }
    }
}