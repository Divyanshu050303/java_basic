package com.company;
import java.util.Scanner;
public class prime_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n, i, c=0;
        System.out.println("Enter the number");
        n= sc.nextInt();
        if (n==0 ||n==1){
            System.out.println(n+" Not a prime number");
        }
        else {
            for (i=2;i<n;i++){
                if (n%i==0){
                    System.out.println(n+" Not a prime number");
                    c=1;
                    break;
                }
            }
            if (c==0){
                System.out.println(n+ " is a prime number");
            }
        }

    }
}
