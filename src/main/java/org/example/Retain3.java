package org.example;


import java.util.Scanner;

public class Retain3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] numbers = sc.nextLine().trim().split(" ");
        int len1 = numbers.length - 1;
        String uniqueNumbers = "";
        int i = 0;
        for (String x : numbers) {
            if (!uniqueNumbers.contains(x)) {
                uniqueNumbers += x + " ";
                i++;
            }
        }
        String[] uniqueNumbers2 = uniqueNumbers.trim().split(" ");
        for (String el : uniqueNumbers2) {
            System.out.printf("%s ", el);
        }

    }
}

