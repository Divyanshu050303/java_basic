package com.company;
import java.util.Scanner;
public class table_in_reverse_order {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n, i;
        System.out.println("Enter the number ");
        n= sc.nextInt();
        for (i=10;i>0;i--){
            System.out.println(n +" x "+i+" = "+n*i);
        }
    }
}
