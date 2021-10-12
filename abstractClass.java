package com.company;
abstract class timePass{
    public void tim(){
        System.out.println("In tim method");
    }
    public abstract void prints();
}
class dat extends timePass{
    @Override
   public void prints(){
       System.out.println("Abstract method in dat class ");
    }
}
public class abstractClass {
    public static void main(String[] args) {
        dat d=new dat();
        d.prints();

    }
}
