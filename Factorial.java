// This program print the factorial number
package com.company;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a, i, fact=1;
        System.out.println("Enter the number");
        a= sc.nextInt();
        for (i=1;i<=a;i++){
            fact*=i;
        }
        System.out.println("Factorial of given number "+fact);
    }
}
