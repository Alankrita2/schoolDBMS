package com.company.p4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionDemo1 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(); //runtime or loosely coupled technique

        list.add(20);
        list.add(40);
        list.add(10);
        list.add(10);

        System.out.println(list);

        System.out.println("----Using Index");
        for(int i=0;i<list.size();++i){
            System.out.print(" " + list.get(i));
        }

        System.out.println("\n----Using for each");
        for (Integer ele: list) {
            System.out.print(" " + ele);
        }

        System.out.println("\n----Using Forward Iterator");
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            System.out.print(" " + it.next());
        }

        System.out.println("\n----Using forEach");
        list.forEach(System.out::println);

        CollectionDemo1 obj = new CollectionDemo1();

        list.add(0,100);

        System.out.println("\n----Using forEach and function");
        list.forEach(obj :: f1);

        list.remove(3);
        System.out.println(list);

        list.remove(new Integer(100));
        System.out.println(list);

        list.clear();
        System.out.println(list);




    }

    public void f1(Integer x){
        System.out.println(x + " ----> " + (x*x));
    }


}
