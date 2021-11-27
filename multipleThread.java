package com.company;
class NewThreads1 implements Runnable{
    String name;
    Thread t;
    NewThreads1(String ThreadName){
        name=ThreadName;
        t=new Thread(this, name);
        System.out.println("New thread :"+t);
        t.start();
    }
    public void run(){
        try{
            for(int i=5;i>0;i--){
                System.out.println(name+" :"+i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println(name+" Interrupted");
        }
        System.out.println(name+"Exiting");
    }
}
public class multipleThread {
    public static void main(String[] args) {
        new NewThreads1("One");
        new NewThreads1("Two");
        new NewThreads1("Three");
        try{
            Thread.sleep(10000);
        }catch (InterruptedException e){
            System.out.println("Main thread interrupted");
        }
        System.out.println("Main thread exiting");
    }
}
