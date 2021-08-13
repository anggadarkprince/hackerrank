package com.anggaari;

import java.util.List;

public class DiagonalDifference {

    public static void main(String[] args) {
        List<List<Integer>> arr = List.of(
                List.of(11, 2, 4),
                List.of(4, 5, 6),
                List.of(10, 8, -12)
        );
        System.out.println(diagonalDifference(arr));
    }

    public static int diagonalDifference(List<List<Integer>> arr) {
        int primary = 0, secondary = 0;

        for (int i = 0; i < arr.size(); i++) {
            List<Integer> row = arr.get(i);
            primary += row.get(i);
            secondary += row.get(row.size() - 1 - i);
        }

        return Math.abs(primary - secondary);
    }
}
