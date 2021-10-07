package com.company;
interface  bicycle {
    int a=54;
    void speedup(int speed);
    void breaks(int bre);
}
class cycle implements bicycle{
    public  void time(){
        System.out.println("Time in applying break");
    }
    public void speedup(int speed){
        System.out.println("Speed up the bicycle ");
    }
    public void breaks(int bre){
        System.out.println("Applying break to avoid accident");
    }
}
public class interfaces_1 {
    public static void main(String[] args) {
        cycle bi=new cycle() ;
        bi.speedup(3);
        System.out.println(bi.a);
    }
}
