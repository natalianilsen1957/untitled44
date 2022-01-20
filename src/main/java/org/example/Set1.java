package org.example;

import org.apache.commons.lang3.ArrayUtils;

import java.util.*;

public class Set1 {
    public static void main(String[] args) {
            HashSet<String> countryHashSet = new HashSet<>();
            countryHashSet.add("Россия");
            countryHashSet.add("Франция");
            countryHashSet.add("Гондурас");
            countryHashSet.add("Кот-Д'Ивуар"); // любимая страна всех котов
        System.out.println(countryHashSet.size());
//        Iterator<String> iterator = countryHashSet.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//
            String[] myArray = {};
            myArray = countryHashSet.toArray(new String[countryHashSet.size()]);
        System.out.println(Arrays.toString(myArray));

        Random random = new Random(30);
         Set<Integer> numberSet2 = new HashSet<>();
        for(int i = 0; i < 10; i++)
            numberSet2.add(random.nextInt(16));
        System.out.println(numberSet2);

        LinkedHashSet <String> linkedHashSet=new LinkedHashSet<>();
        Set<String> ts1 = new TreeSet<>();

        int[] firstArray = { 1, 3, 5, 2 };
        int[] secondArray = { 6, 8, 7 };
        int[] treeArray = { 61, 81, 71 };
// используем специальный метод addAll() служебного класса ArrayUtils
        int[] newArray1 = ArrayUtils.addAll(firstArray, secondArray);
        int[] newArray2 = ArrayUtils.addAll(newArray1, treeArray);
        System.out.println(Arrays.toString(newArray2));
        String inputString = "Пример использования метода replace в Java";
// заменяем маленькую букву 'п' на большую 'П' и получаем новую строку result
        String result = inputString.replace('п', 'П');
        String result1 = inputString.replace("пользован","DDDDDD");
        String result2 = inputString.replaceAll("a", "DDD");
        System.out.println (result);
        System.out.println (result1);
        System.out.println (result2);

    }
}
