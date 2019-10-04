package com.company.wangyi;

class Example{
    private int cnt2;
    int cnt1 = 0;
    public void m0(){
        cnt1 +=2;
        cnt2 +=2;
        System.out.print(cnt1+ " "+cnt2);
    }
}

class Mythread extends Thread{
    private Example i;

    public Mythread(Example i){
        this.i = i;
    }

    @Override
    public void run(){
        synchronized (i){
            i.m0();;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Example mv = new Example();
        Thread t1 = new Mythread(mv);
        Thread t2 = new Mythread(mv);
        Thread t3 = new Mythread(mv);
        t1.start();
        t2.start();
        t3.start();

    }
}
