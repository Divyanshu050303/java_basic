package com.company;
import java.util.Scanner;
public class binary_to_decimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n, rem, sum=0, j=1;
        System.out.println("Enter the number...");
        n= sc.nextLong();
        while (n!=0){
            rem=n%10;
            sum=sum+rem*j;
            j=j*8;
            n=n/10;
        }
        System.out.println(sum);

    }
}
