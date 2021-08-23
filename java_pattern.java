package com.company;
import java.util.Scanner;
public class java_pattern {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n, i,j;
    System.out.println("Enter the number of rows in pattern");
    n=sc.nextInt();
    for(i=1;i<n+1;i++){
        for(j=1;j<i+1;j++){
            System.out.print(j+" ");
        }
        System.out.println();
    }
    }
}
