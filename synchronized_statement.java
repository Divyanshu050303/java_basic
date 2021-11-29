package com.company;
class callMe{
    void call(String msg){
        System.out.println("["+msg);
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            System.out.println("Interrupted");
        }
        System.out.println("]");
    }
}
class caller implements Runnable{
    String msg;
    callMe target;
    Thread t;
    public caller(callMe targ, String s){
        target=targ;
        msg=s;
        t=new Thread(this);
        t.start();
    }
    public void run(){
        synchronized (target){
            target.call(msg);
        }
    }
}
public class synchronized_statement {
    public static void main(String[] args) {
        callMe target=new callMe();
        caller ob1=new caller(target,"Hello" );
        caller ob2=new caller(target, "Synchronized");
        caller ob3=new caller(target, "World");
        try{
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        }catch (InterruptedException e){
            System.out.println("Interrupted");
        }
    }
}
