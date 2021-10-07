package com.company;
class factorial{
    int fact(int n){
        int result;
        if(n==1) return 1;
        result=fact(n-1)*n;
        return result;
    }
}
public class recursion_in_java {
    public static void main(String[] args) {
        factorial fc=new factorial();
        System.out.println("Factorial  of 3 is "+ fc.fact(1));
        System.out.println("Factorial  of 4 is "+ fc.fact(4));
        System.out.println("Factorial  of 6 is "+ fc.fact(6));
    }
}
