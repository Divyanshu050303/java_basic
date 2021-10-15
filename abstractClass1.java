package com.company;
abstract class parnts{
    abstract void message();
}
class firstSubClass extends parnts{
    void message(){
        System.out.println("Message in first sub class");
    }
}
class secondSubClass extends parnts{
    void message(){
        System.out.println("Message in second sub class");
    }
}
public class abstractClass1 {
    public static void main(String[] args) {
        firstSubClass f=new firstSubClass();
        f.message();
        secondSubClass s=new secondSubClass();
        s.message();
    }
}
