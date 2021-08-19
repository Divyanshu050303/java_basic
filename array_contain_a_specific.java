package com.company;
import java.util.Scanner;
public class array_contain_a_specific {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n, i, m;
        System.out.println("Enter the length of array");
        n= sc.nextInt();
        int [] array=new int[n];
        for (i=0;i<n;i++){
            array[i]= sc.nextInt();
        }
        System.out.println("Enter the number want you want to search in the array");
        m= sc.nextInt();
        for(i=0;i<n;i++){
            if (array[i]==m){
                System.out.println("Present  at "+i+" index");
            }
        }
    }
}
