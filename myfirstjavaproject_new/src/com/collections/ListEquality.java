package com.collections;
import java.util.*;

public class ListEquality {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(3, 2, 1));

        Collections.sort(list1);
        Collections.sort(list2);

        System.out.println(list1.equals(list2));
    }
}