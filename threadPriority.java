package com.company;
class priority implements Runnable{
    int click=0;
    Thread t;
    private volatile boolean running =true;
    public priority(int p){
        t=new Thread(this);
        t.setPriority(p);
    }
    public void run(){
        while (running){
            click++;
        }
    }
    public void stop(){
        running=false;
    }
    public void start(){
        t.start();
    }
}
public class threadPriority {
    public static void main(String[] args) {
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        priority hi=new priority(Thread.NORM_PRIORITY +2);
        priority lo=new priority(Thread.NORM_PRIORITY -2);
        lo.start();
        hi.start();
        try{
            Thread.sleep(10000);
        }catch (InterruptedException e){
            System.out.println("Main thread interrupted:");
        }
        lo.stop();
        hi.stop();
        try{
            hi.t.join();
            lo.t.join();
        }catch (InterruptedException e){
            System.out.println("Interrupted exception caught");
        }
        System.out.println("Low-priority thread :"+lo.click);
        System.out.println("High-priority thread:"+hi.click);
    }
}
