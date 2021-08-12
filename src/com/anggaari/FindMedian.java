package com.anggaari;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FindMedian {
    public static void main(String[] args) {
        List<Integer> arr = List.of(4, 2, 1, 3, 5);
        System.out.println(findMedian(arr));
    }

    public static int findMedian(List<Integer> arr) {
        List<Integer> temp =  new ArrayList<>(arr);
        Collections.sort(temp);

        return temp.get(temp.size() / 2);
    }
}
