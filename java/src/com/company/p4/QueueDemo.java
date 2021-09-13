package com.company.p4;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class QueueDemo {

    public static void main(String[] args) {
        LinkedList<Integer> queue = new LinkedList<>(); //runtime or loosely coupled technique

        queue.add(20);
        queue.add(40);
        queue.add(10);
        queue.add(10);

        System.out.println(queue);

        System.out.println("----Using Index");
        Integer[] array = queue.toArray( new Integer[queue.size()] );
        for(int i=0;i<array.length;++i){
            System.out.print("\n"+ i + " " + array[i]);
        }

        System.out.println("\n----Using for each");
        for (Integer ele: queue) {
            System.out.print(" " + ele);
        }

        System.out.println("\n----Using Forward Iterator");
        Iterator<Integer> it = queue.iterator();
        while(it.hasNext()){
            System.out.print(" " + it.next());
        }

        System.out.println("\n----Using forEach");
        queue.forEach(System.out::println);

        CollectionDemo1 obj = new CollectionDemo1();

        queue.push(100);

        System.out.println("\n----Using forEach and function");
        queue.forEach(obj :: f1);

        queue.remove(3);
        System.out.println(queue);

        queue.pop();
        System.out.println(queue);

        queue.clear();
        System.out.println(queue);




    }

    public void f1(Integer x){
        System.out.println(x + " ----> " + (x*x));
    }


}
