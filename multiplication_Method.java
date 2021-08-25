package com.company;
import java.util.Scanner;
public class multiplication_Method {
    static void mul(int x ){
        int i, mul=1;
        System.out.println("Here is your multiplication table");
        for(i=1;i<11;i++){
            System.out.println(x+" x "+i+" = "+x*i);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the number ");
        n= sc.nextInt();
        mul(n);
    }
}
