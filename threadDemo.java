package com.company;
class NewThread implements Runnable{
    Thread t;
    NewThread(){
        t=new Thread(this, "Demo Thread ");
        System.out.println("Child Thread "+t);
        t.start();
    }
    public void run(){
    try{
        for(int i=5;i>0;i--) {
            System.out.println("Child Thread " + i);

            Thread.sleep(1500);
        }
    }
    catch(InterruptedException e){
        System.out.println("Child interrupted");
    }
        System.out.println("Exiting child thread");
    }
}
public class threadDemo {
    public static void main(String[] args) {
        new NewThread();
        try{
            for(int i=5;i>0;i--){
                System.out.println("Main thread "+i);
                Thread.sleep(500);
            }
        }catch (InterruptedException e){
            System.out.println("main thread interrupted");
        }
        System.out.println("Main thread exiting");
    }
}
