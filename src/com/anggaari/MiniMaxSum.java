package com.anggaari;

import java.util.List;

public class MiniMaxSum {

    public static void main(String[] args) {
        List<Integer> arr2 = List.of(5, 5, 5, 5, 5);
        miniMaxSum(arr2);
    }

    public static void miniMaxSum(List<Integer> arr) {
        long min = 0, max = 0;

        for (int i = 0; i < arr.size(); i++) {
            long total = 0;
            for (int j = 0; j < arr.size(); j++) {
                if (i == j) {
                    continue;
                }
                total += arr.get(j);
            }
            if (min == 0 || total < min) {
                min = total;
            }
            if (max == 0 || total > max) {
                max = total;
            }
        }
        System.out.println(min + " " + max);
    }
}
