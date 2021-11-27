package com.company;
class NewThread extends Thread {
    NewThread() {
        super("Demo Thread");
        System.out.println("Child Thread " + this);
        start();
    }

    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Child Thread " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Child interrupted ");
        }
        System.out.println("Exiting child thread");
    }
}
public class extendingThread {
    public static void main(String[] args) {
        new NewThread();
        try{
            for(int i=5;i>0;i--){
                System.out.println("Main thread "+i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println("Main interrupted");
        }
        System.out.println("Main thread exiting");
    }
}
