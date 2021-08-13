package com.anggaari;

import java.util.List;
import java.util.Objects;

public class LonelyInteger {

    public static void main(String[] args) {
        List<Integer> arr = List.of(1, 2, 3, 4, 3, 2, 1);
        System.out.println(lonelyInteger(arr));
    }

    public static int lonelyInteger(List<Integer> a) {
        for (int i = 0; i < a.size(); i++) {
            boolean hasPair = false;
            for (int j = 0; j < a.size(); j++) {
                if (i == j) {
                    continue;
                }
                if (Objects.equals(a.get(i), a.get(j))) {
                    hasPair = true;
                    break;
                }
            }
            if (!hasPair) {
                return a.get(i);
            }
        }
        return 0;
    }
}
