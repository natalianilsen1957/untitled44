package org.example.IO777;

import java.util.Scanner;

public class A22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        final int maxNum = 10;

        if (number > 0 && number < 10) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
