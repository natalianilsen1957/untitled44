package org.example;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.Range;

import java.util.*;

public class AllBest {
    public static void main(String[] args) {

        ArrayList<String[]> nums1 = new ArrayList<>();
        String[] str0 = "asdfgh0 fgh0 rtyu0 fgh0 gfgh0".split(" ");
        String[] str1 = "asdfgh fgh rtyu fgh gfgh".split(" ");
        nums1.add(str0);
        nums1.add(str1);
        Iterator<String[]> iter1 = nums1.iterator();
//        for (int i = 1; i < str.length && sc.hasNext();
        while (iter1.hasNext()) {
            String[] str2 = iter1.next();
            System.out.println(Arrays.toString(str2));
        }

        List<List<String>> nums4 = new ArrayList<List<String>>();
        String str5 = "asdfgh5 fgh5 rtyu5 fg5h gfgh5";
        List<String> num5 = new ArrayList<String>(Arrays.asList((str5.split(" "))));
        nums4.add(num5);
        System.out.print(nums4.get(0).get(3) + " "+"\n");

        String[] nums6 = {"hello world", "nihao?", "Abc", "chilemaNin"};
        String[] nums7 = Arrays.copyOf(nums6, nums6.length);
        Arrays.parallelSort(nums7, Comparator.comparing(String::length));
        int ind6 = ArrayUtils.indexOf(nums7, nums6[0]);

        Integer[] nums8 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        List<Integer> nums9 = new ArrayList<Integer>(Arrays.asList(nums8));
        nums9.set(0,400);
        System.out.println(nums9);

        StringBuilder stringBuilder = new StringBuilder("");
//        stringBuilder.append(sc.nextLine());
        stringBuilder.append(" ");
        String str10=stringBuilder.toString();



        Range<Integer> test1 = Range.between(2, 10);
        boolean t1 = test1.contains(3);
        boolean t2 = nums1.contains("s");

//        System.out.println(Arrays.toString(single.toArray()).replaceAll("[,\\[\\]]", ""))











    }
}

