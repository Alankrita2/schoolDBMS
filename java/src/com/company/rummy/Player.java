package com.company.rummy;

public class Player extends Thread{
    synchronized public void f1(){
        try{
            notifyAll();
            System.out.print("Player 1");
            wait();
        }catch(Exception e){

        }
    }

    synchronized public void f2(){
        try{
            notifyAll();
            System.out.print("Player 2");
            wait();
        }catch(Exception e){

        }
    }

    synchronized public void f3(){
        try{
            notifyAll();
            System.out.print("Player 3");
            wait();
        }catch(Exception e){

        }
    }

}

class Player1 extends Thread{

    Player obj;
    public Player1(){
        this.obj = null;
    }

    public Player1(Player obj){
        this.obj = obj;
    }

    @Override
    public void run(){
        for(int i=0;i<10;++i)
            obj.f1();
    }

}

class Player2 extends Thread{

    Player obj;
    public Player2(){
        this.obj = null;
    }

    public Player2(Player obj){
        this.obj = obj;
    }

    @Override
    public void run(){
        for(int i=0;i<10;++i) {
            if (i == 0) {
            try {
                sleep(30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
            obj.f2();
        }
    }

}

class Player3 extends Thread{

    Player obj;
    public Player3(){
        this.obj = null;
    }

    public Player3(Player obj){
        this.obj = obj;
    }

    @Override
    public void run(){
        for(int i=0;i<10;++i){
            if (i == 0) {
                try {
                    sleep(40);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            obj.f3();
        }

    }

}


