package com.anggaari;

import java.util.List;

public class PlusMinus {

    public static void main(String[] args) {
        List<Integer> arr = List.of(-4, 3, -9, 0, 4, 1);
        plusMinus(arr);
    }

    public static void plusMinus(List<Integer> arr) {
        int totalPositive = 0, totalNegative = 0, totalZero = 0;

        for (Integer integer : arr) {
            if (integer > 0) {
                totalPositive++;
            } else if (integer < 0) {
                totalNegative++;
            } else {
                totalZero++;
            }
        }

        System.out.printf("%.6f%n", (float) totalPositive / arr.size());
        System.out.printf("%.6f%n", (float) totalNegative / arr.size());
        System.out.printf("%.6f%n", (float) totalZero / arr.size());
    }
}
