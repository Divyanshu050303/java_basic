package com.company;
abstract class Animls{
    abstract void cats();
    abstract void dogs();
}
class Cats extends Animls{
    void cats(){
        System.out.println("This is the cats abstract methods is Cats sub class");
    }
    void dogs(){
        System.out.println("This is the dogs abstract methods in Cats subclass");
    }
}
class Dogs extends Animls{
    void cats(){
        System.out.println("This is the cats abstract methods is Dogs sub class");
    }
    void dogs(){
        System.out.println("This is the dogs abstract methods in Dogs subclass");
    }
}
public class animals {
    public static void main(String[] args) {
        Cats c=new Cats();
        c.cats();
        Dogs d= new Dogs();
        d.dogs();
    }
}
