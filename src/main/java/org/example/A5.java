package org.example;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.HashSet;
//import java.util.Set;
//
//public class A5 {
//    public static void main(String[] args) {
//        // source array
//        int [] src = {10, 15, 20, 25, 30};
//        // destination array
//        int [] dest = new int[src.length];
//        // copy array using System.arraycopy
//        System.arraycopy(src, 0, dest, 0, src.length);
//        // display arrays
//        System.out.println("Source array =         " +
//                Arrays.toString(src));
//        System.out.println("Destination array =    " +
//                Arrays.toString(dest));
//
//        String [] source = {"a", "c", "e","a3", "c3", "e3","a4", "c4", "e4", "a5", "c5", "e5"};
//        String [] str2 = { "a2", "c2", "e2"};
//        boolean contains = Arrays.asList(source).contains("e");
//        String [] str3 =source.clone();
//        String [] str4 = Arrays.copyOf(source, source.length);
//        String [] str5 =Arrays.copyOfRange(source, source.length-9, source.length-7);
//        System.out.println(Arrays.toString(str5));
//
//
//
//        int s[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
//        int d[] = { 15, 25, 35, 45, 55, 65, 75, 85, 95, 105};
//
//        int source_arr[], sourcePos, dest_arr[], destPos, len;
//        source_arr = s;
//        sourcePos = 3;
//        dest_arr = d;
//        destPos = 5;
//        len = 4;
//        System.arraycopy(source_arr, sourcePos, dest_arr, destPos, len);
//        System.out.println(Arrays.toString(d));
//
//        int[] sourceArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
//        int[] destArr = new int[3];
//        System.arraycopy(sourceArr, 5, destArr, 0, 3);
//        System.out.println(Arrays.toString(destArr));
//
//        String [] stringArray ={c, b, a, d, e};
//        Set<String> simpleSet = new HashSet<String>(Arrays.asList(stringArray));
//        System.out.println(simpleSet);
//
//
//
//        }
//    }
//

//https://javadevblog.com/populyarny-e-metody-dlya-raboty-s-java-massivami.html