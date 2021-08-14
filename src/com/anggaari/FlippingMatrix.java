package com.anggaari;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FlippingMatrix {

    public static void main(String[] args) {
        List<List<Integer>> arr = List.of(
                List.of(112, 42, 83, 119),
                List.of(56, 125, 56, 49),
                List.of(15, 78, 101, 43),
                List.of(62, 98, 114, 108)
        );
        List<List<Integer>> arr2 = List.of(
                List.of(62, 83, 42, 112),
                List.of(15, 125, 56, 49),
                List.of(56, 78, 101, 43),
                List.of(119, 98, 114, 108)
        );
        List<List<Integer>> arr3 = List.of(
                List.of(119, 114, 42, 112),
                List.of(56, 125, 101, 49),
                List.of(15, 78, 56, 43),
                List.of(62, 98, 83, 108)
        );
        System.out.println(flippingMatrix(arr));
    }

    public static int flippingMatrixRowFirstThenColumn(List<List<Integer>> matrix) {
        int q = matrix.size() / 2;
        int max = 0;
        ArrayList<List<Integer>> temp;

        for (int i = 0; i < matrix.size(); i++) {
            temp = new ArrayList<>(matrix);

            List<Integer> reverse = new ArrayList<>(temp.get(i));
            Collections.reverse(reverse);
            temp.set(i, reverse);

            for (int j = 0; j < matrix.size(); j++) {
                List<Integer> column = new ArrayList<>();
                for (int k = 0; k < matrix.size(); k++) {
                    column.add(k, temp.get(k).get(j));
                }

                for (int k = 0; k < matrix.size(); k++) {
                    List<Integer> rowFlip = new ArrayList<>(temp.get(k));
                    rowFlip.set(j, column.get(matrix.size() - 1 - k));
                    temp.set(k, rowFlip);
                }

                // calculate top left quadrant
                int tempTotal = 0;
                for (int a = 0; a < q; a++) {
                    for (int b = 0; b < q; b++) {
                        tempTotal += temp.get(a).get(b);
                    }
                }
                System.out.println(temp);
                System.out.println(tempTotal);
                if (tempTotal > max) {
                    max = tempTotal;
                }
            }
        }
        return max;
    }

    public static int flippingMatrix(List<List<Integer>> matrix) {
        int q = matrix.size() / 2;
        int max = 0;
        ArrayList<List<Integer>> temp;

        for (int j = 0; j < matrix.size(); j++) {
            temp = new ArrayList<>(matrix);

            List<Integer> column = new ArrayList<>();
            for (int k = 0; k < matrix.size(); k++) {
                column.add(k, temp.get(k).get(j));
            }

            for (int k = 0; k < matrix.size(); k++) {
                List<Integer> rowFlip = new ArrayList<>(temp.get(k));
                rowFlip.set(j, column.get(matrix.size() - 1 - k));
                temp.set(k, rowFlip);
            }

            ArrayList<List<Integer>> beforeReverse = new ArrayList<>(temp);
            for (int i = 0; i < matrix.size(); i++) {
                temp = beforeReverse; // reset before reverse
                List<Integer> reverse = new ArrayList<>(beforeReverse.get(i));
                Collections.reverse(reverse);
                temp.set(i, reverse);

                // calculate top left quadrant
                int tempTotal = 0;
                for (int a = 0; a < q; a++) {
                    for (int b = 0; b < q; b++) {
                        tempTotal += temp.get(a).get(b);
                    }
                }
                if (tempTotal > max) {
                    max = tempTotal;
                }
            }
        }

        return max;
    }
}
