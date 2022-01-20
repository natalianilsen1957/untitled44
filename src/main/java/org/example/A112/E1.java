package org.example.A112;

import java.util.Arrays;

public class E1 {
    public static void main(String[] args) {
        int[] numbers = {-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 0, 1, 2, 3, 4, 5};
        Arrays.stream(numbers).filter(x->x>0);
    }
}
