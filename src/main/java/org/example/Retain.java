package org.example;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Retain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        int a2 = sc.nextInt();
        int b2 = sc.nextInt();


        Set<Integer> point1 = new HashSet<Integer>();
        Set<Integer> point2 = new HashSet<Integer>();

        for (int i = a1; i <= b1; i++) {
            point1.add(i);
        }

        for (int i = a2; i <= b2; i++) {
            point2.add(i);
        }

        point1.retainAll(point2);

        int n = point1.size();
        if (n == 0) {
            System.out.println("Пересечения нет");
        } else {
            int min1 = Collections.min(point1);
            if (n >= 2) {
                int max1 = Collections.max(point1);
                System.out.println(min1 + " " + max1);
            } else {
                System.out.println(min1);
            }
        }
    }
}