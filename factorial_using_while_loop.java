package com.company;
import java.util.Scanner;
public class factorial_using_while_loop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n, i=1, fact=1;
        System.out.println("Enter the number");
        n= sc.nextInt();
        while (i<=n){
            fact*=i;
            i++;
        }
        System.out.println("Here is your factorial "+fact);
    }
}
