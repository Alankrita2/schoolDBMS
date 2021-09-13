package com.company.p5;

public class Demo3 {

    public static void main(String[] args) {
        TictocGame obj = new TictocGame();
        Player1 p1 = new Player1(obj);
        Player2 p2 = new Player2(obj);

        p1.start();
        p2.start();
        int a =10;
        if (a){ System.out.println(a);}
    }
}
