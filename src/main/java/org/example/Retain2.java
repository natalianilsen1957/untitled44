package org.example;


import java.util.*;

public class Retain2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] numbers = sc.nextLine().trim().split(" ");
        Set<String> setUniqueNumbers = new LinkedHashSet<String>();
        for(String x : numbers) {
            setUniqueNumbers.add(x);
        }
        int len1=setUniqueNumbers.size();
        int i=0;
        for(String x : setUniqueNumbers) {
            System.out.print((i<(len1-1)) ? x + " " : x);
            i++;
        }

    }
}
