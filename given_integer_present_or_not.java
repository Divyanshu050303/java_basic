package com.company;
import java.util.Scanner;
public class given_integer_present_or_not {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n, i, m, c=0;
        int []array=new int[100];
        System.out.println("Enter length of array ");
        n= sc.nextInt();
        for (i=0; i<n;i++){
            array[i]= sc.nextInt();
        }
        System.out.println("Enter the number which you want to search");
        m= sc.nextInt();
        for (i=0;i<n;i++) {
            if (array[i] == m) {
                c += 1;
            }
        }
        if (c>0){
            System.out.println("Present in the array");
        }
        else {
            System.out.println("Not present in the array");
        }

    }
}
