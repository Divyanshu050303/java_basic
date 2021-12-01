package com.company;
class Q {
    int n;
    boolean valueSet = false;

    synchronized int get() {
        if (!valueSet)
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Interrupted Exception caught ");
            }
        System.out.println("got" + n);
        valueSet = false;
        notify();
        return n;

    }

    synchronized void put(int n) {
        if (valueSet)
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Interrupted exception caught");
            }
        this.n = n;
        valueSet = true;
        System.out.println("Put: " + n);
        notify();
    }
}
class Producer implements Runnable{
    Q q;
    Producer(Q q){
        this.q=q;
        new Thread (this, "Producer").start();
    }
    public void run(){
       int i=0;
       while (true){
           q.put(i++);
       }
    }
}
class consumer implements  Runnable{
    Q q;
    consumer(Q q){
        this.q=q;
        new Thread(this, "Consumer").start();
    }
    public void run(){
        while(true){
            q.get();
        }
    }
}
public class interthreadCommunication {
    public static void main(String[] args) {
        Q q=new Q();
        new Producer(q);
        new consumer(q);
        System.out.println("Press control-C to stop");
    }
}
