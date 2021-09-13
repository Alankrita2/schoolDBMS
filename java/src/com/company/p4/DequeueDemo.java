package com.company.p4;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class DequeueDemo {

    public static void main(String[] args) {
        List<Integer> dqueue = new LinkedList<>(); //runtime or loosely coupled technique

        dqueue.add(20);
        dqueue.add(40);
        dqueue.add(10);
        dqueue.add(10);

        System.out.println(dqueue);

        System.out.println("----Using Index");
        Integer[] array = dqueue.toArray( new Integer[dqueue.size()] );
        for(int i=0;i<array.length;++i){
            System.out.print("\n"+ i + " " + array[i]);
        }

        System.out.println("\n----Using for each");
        for (Integer ele: dqueue) {
            System.out.print(" " + ele);
        }

        System.out.println("\n----Using Forward Iterator");
        Iterator<Integer> it = dqueue.iterator();
        while(it.hasNext()){
            System.out.print(" " + it.next());
        }

        System.out.println("\n----Using forEach");
        dqueue.forEach(System.out::println);

        CollectionDemo1 obj = new CollectionDemo1();

        dqueue.add(100);

        System.out.println("\n----Using forEach and function");
        dqueue.forEach(obj :: f1);

        dqueue.remove(3);
        System.out.println(dqueue);

        dqueue.remove(new Integer(100));
        System.out.println(dqueue);

        dqueue.clear();
        System.out.println(dqueue);




    }

    public void f1(Integer x){
        System.out.println(x + " ----> " + (x*x));
    }


}
