package com.company;
abstract class print{
    print(){
        System.out.println("This is the constructor of abstract calss");
    }
    abstract void a_method();
    void non_abstract(){
        System.out.println("This is the normal method of abstract class");
    }
}
class subClass extends print{
    void a_method(){
        System.out.println("This is the abstract method ");
    }
}
public class abstractPrint {
    public static void main(String[] args) {
        subClass sc=new subClass();
        sc.a_method();
        sc.non_abstract();
    }
}
