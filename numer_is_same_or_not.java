package com.company;
import java.util.Scanner;
public class numer_is_same_or_not {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double x, y, z;
        System.out.println("Enter the first number");
        x=sc.nextDouble();
        System.out.println("Enter the second number");
        y=sc.nextDouble();
        System.out.println("Enter the third number");
        z=sc.nextDouble();
        if (x==y && z==y){
            System.out.println("All number are same...");
        }
        else if(x==y || y==z ||z==x){
            System.out.println("Neither all are same and different");
        }
        else {
            System.out.println("All the number are different ");
        }
    }
}
