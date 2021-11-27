package com.company;
class Newthrads implements Runnable{
    String name;
    Thread t;
    Newthrads(String ThreadName) {
        name = ThreadName;
        t=new Thread(this, name);
        System.out.println("New Threads " + t);
        t.start();
    }
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(name + ":" + i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println(name+" Interrupted");
        }
        System.out.println(name+" Exiting .");
    }
}
public class isAliveJoind {
    public static void main(String[] args) {
        Newthrads ob1=new Newthrads("One");
        Newthrads ob2=new Newthrads("Two");
        Newthrads ob3=new Newthrads("Three");
        System.out.println("Thread one is alive "+ob1.t.isAlive());
        System.out.println("Thread two is alive "+ob2.t.isAlive());
        System.out.println("Thread three is alive "+ob3.t.isAlive());
        try{
            System.out.println("Waiting for threads to finish.");
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        }
        catch (InterruptedException e){
            System.out.println("Main thread interrupted");
        }

        System.out.println("Thread one is alive "+ob1.t.isAlive());
        System.out.println("Thread two is alive "+ob2.t.isAlive());
        System.out.println("Thread three is alive "+ob3.t.isAlive());
        System.out.println("Main thread exiting");
    }
}
