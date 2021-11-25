package com.company;

public class main_thread {
    public static void main(String[] args) {
        Thread t=Thread.currentThread();
        System.out.println("Current thread"+t);
        t.setName("My thread");
        System.out.println("After name change :"+t);
        try{
            for(int i=6;i>0;i--){
                System.out.println(i);
                Thread.sleep(500);
            }

        }
        catch (InterruptedException e){
            System.out.println("Main thread interrupted");
        }
    }
}
