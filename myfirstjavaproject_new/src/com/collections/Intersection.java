package com.collections;
import java.util.*;

public class Intersection {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(3, 4, 5, 6));

        list1.retainAll(list2);

        System.out.println(list1);
    }
}