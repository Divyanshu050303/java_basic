package com.company;
import java.util.Scanner;
public class AddThreeNumber {
    public static void main(String[] args) {
        System.out.println("Program to enter by the user");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int a= sc.nextInt();
        System.out.println("Enter the second number");
        int b=sc.nextInt();
        System.out.println("Enter the third number");
        int c=sc.nextInt();
        System.out.println("Enter the fourth number");
        float d=sc.nextFloat();
        float sum=a+b+c+d;

        System.out.println("The addition of two number "+sum);
    }
}
