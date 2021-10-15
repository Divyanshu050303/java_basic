package com.company;
abstract class Banks{
    abstract void getBalance();
}
class bankA extends Banks{
    void getBalance(){
        System.out.println("Balance is 100$");
    }
}
class bankB extends Banks{
    void getBalance(){
        System.out.println("Balance is 150$");
    }
}
class bankC extends Banks{
    void getBalance(){
        System.out.println("Balance is 200$");
    }
}
public class bank {
    public static void main(String[] args) {
        bankA a=new bankA();
        a.getBalance();
        bankB b=new bankB();
        b.getBalance();
        bankC c=new bankC();
        c.getBalance();
    }
}
