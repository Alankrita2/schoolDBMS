package com.company.p4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionDemo2 {

    public static void main(String[] args) {
        Integer a1[] = {10,20,30,40};
        Integer a2[] = {30,60,90,120};

        List<Integer> l1 = new ArrayList<>(Arrays.asList(a1));
        List<Integer> l2 = new ArrayList<>(Arrays.asList(a2));

        System.out.println("l1 : " + l1);
        System.out.println("l2 : " + l2);

        l1.addAll(l2);
        System.out.println("l1 : " + l1);
        l1.removeAll(l2);

        System.out.println("l1 : " + l1);
    }
}
