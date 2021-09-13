package com.company.p4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>(); //runtime or loosely coupled technique

        set.add(20);
        set.add(40);
        set.add(10);
        set.add(10);

        System.out.println(set);

        System.out.println("----Using Index");
        Integer[] array = set.toArray( new Integer[set.size()] );
        for(int i=0;i<array.length;++i){
            System.out.print("\n"+ i + " " + array[i]);
        }

        System.out.println("\n----Using for each");
        for (Integer ele: set) {
            System.out.print(" " + ele);
        }

        System.out.println("\n----Using Forward Iterator");
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()){
            System.out.print(" " + it.next());
        }

        System.out.println("\n----Using forEach");
        set.forEach(System.out::println);

        CollectionDemo1 obj = new CollectionDemo1();

        set.add(100);

        System.out.println("\n----Using forEach and function");
        set.forEach(obj :: f1);

        set.remove(3);
        System.out.println(set);

        set.remove(new Integer(100));
        System.out.println(set);

        set.clear();
        System.out.println(set);




    }

    public void f1(Integer x){
        System.out.println(x + " ----> " + (x*x));
    }


}

