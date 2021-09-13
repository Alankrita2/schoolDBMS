package com.company.p5;

public class ThreadDemo extends Thread{

    String name;
    int n;

    public ThreadDemo() {
        this.name = "Brillio";
        this.n = 10;
    }

    public ThreadDemo(String name, int n) {
        this.name = name;
        this.n = n;
    }

    @Override
    public void run() {
        super.run();
        for(int i=0;i<n;++i){
            System.out.println(name + "-->" + i);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
