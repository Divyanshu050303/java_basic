package com.company;
import java.util.Scanner;
public class Fibonacci_Series {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=0, b=1, c, i, n;
        System.out.println("Enter the number");
        n=sc.nextInt();
        System.out.print(a+" "+b);
        for (i=2;i<n;i++){
            c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
        }
    }
}
