package com.company.p5;

public class TictocGame {

    synchronized public void f1(){
        try{
            notify();
            System.out.print("Tic - ");
            wait();
        }catch(Exception e){

        }
    }

    synchronized public void f2(){
        try{
            notify();
            System.out.println("Toc");
            wait();
        }catch(Exception e){

        }
    }
}
class Player1 extends Thread{

    TictocGame obj;
    public Player1(){
        this.obj = null;
    }

    public Player1(TictocGame obj){
        this.obj = obj;
    }

    @Override
    public void run(){
        for(int i=0;i<10;++i)
            obj.f1();
    }

}

class Player2 extends Thread{

    TictocGame obj;
    public Player2(){
        this.obj = null;
    }

    public Player2(TictocGame obj){
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


