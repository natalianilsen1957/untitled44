package org.example;

import java.util.HashSet;

public class Set2 {
     public static void main(String[] args) {

        HashSet<String> countryHashSet = new HashSet<>();
        countryHashSet.add("Россия");
        countryHashSet.add("Кот-Д'Ивуар"); // любимая страна всех котов
        countryHashSet.add("Франция");
        countryHashSet.add("Гондурас");

        // Конвертируем HashSet в массив
        String[] myArray = {};
        myArray = countryHashSet.toArray(new String[countryHashSet.size()]);


     }
 }
