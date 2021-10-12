package com.company;
class fruit{
    fruit(){
        System.out.println("Apple  base class non parameterized");
    }
    fruit(int a){
        System.out.println("Banana base class para");
    }
    public  void time(){
        System.out.println("Time pass");
    }
}
class veg extends fruit{

    public void time(){
        System.out.println("Int veg class");
    }
    veg(){
        System.out.println(" derived non para");
    }

    veg(int a){
        super(a);
        System.out.println(" derived para");
    }
}
public class superKeyWord {
    public static void main(String[] args) {
        veg v=new veg();
        v.time();
        fruit f=new fruit();
        f.time();

    }
}
