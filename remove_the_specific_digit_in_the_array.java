package com.company;
import java.util.Arrays;
import java.util.Scanner;
public class remove_the_specific_digit_in_the_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int  n, i, remo;
        System.out.println("Enter the length of array");
        n= sc.nextInt();
        int [] arra=new int[n];
        System.out.println("Enter the element in the array");
        for (i=0;i<n;i++){
            arra[i]= sc.nextInt();
        }
        System.out.println("Enter the index which you want to remove");
        remo= sc.nextInt();
        System.out.println("The original array "+ Arrays.toString(arra));
        for(i=remo;i<n-1;i++){
            arra[i]=arra[i+1];
        }

        System.out.println("After the remove your enter the index"+Arrays.toString(arra));
    }
}
