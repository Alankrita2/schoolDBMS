package com.company.p5;

public class Demo2 {

    public static void main(String[] args) {
        ThreadDemo obj = new ThreadDemo();
        ThreadDemo obj1 = new ThreadDemo("Wipro", 15);
        ThreadDemo obj2 = new ThreadDemo("Infosys",28);

        obj.start();
        obj1.start();
        obj2.start();

    }
}
