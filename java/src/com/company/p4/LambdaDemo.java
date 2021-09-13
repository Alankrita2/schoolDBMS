package com.company.p4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaDemo {

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(new Integer[]{4,5,6,7,8,9,15}));

        int x = (int) arr.stream().filter(i->i%2==0).count();
        System.out.print("\ncount of even number present in an array : " + x);


        List<Integer> even = arr.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println("\nEven numbers present in an array : "+even);
    }
}
