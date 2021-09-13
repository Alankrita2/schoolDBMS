package com.company.p4;

import java.util.Map;
import java.util.TreeMap;

public class Student {
    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>();

        String flag = "y";
        while(flag.compareTo("y") == 0){
            System.out.println("Enter Student Name : ");
            String s = ReadData.sc.next();
            System.out.println("Enter Student ID : ");
            Integer id = ReadData.sc.nextInt();

            map.put(s,id);

            System.out.println("\n Do you want to enter more student details? y/n : ");
            flag = ReadData.sc.next();

        }

        int a =10;
        if (a){ System.out.println(a);}
        System.out.println(map);
    }
}
