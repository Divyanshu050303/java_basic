package com.company;

public class varargs {
    static int sum(int ...arr){
        int sum1=0;
        for(int a:arr){
            sum1+=a;
        }
        return sum1;
    }
    public static void main(String[] args) {
        System.out.println("The sum of 4, 5, 6,7 is "+ sum(4, 5, 6, 7 ));
    }
}
