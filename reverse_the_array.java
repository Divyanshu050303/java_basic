package com.company;
import java.util.Scanner;
public class reverse_the_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n, tem, j,i;
        int []array=new int[100];
        System.out.println("Enter the length of array ");
        n= sc.nextInt();
        for(i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        j=n;
        for (i=0;i<n/2;i++){
            tem=array[i];
            array[i]=array[j-i-1];
            array[j-i-1]=tem;
        }
        System.out.println("This is your reverse array ");
        for (i=0;i<n;i++){
            System.out.println(array[i]);
        }
    }
}
