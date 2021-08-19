package com.company;

import java.util.Scanner;
public class sum_array_element {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n, i, sum=0;
        System.out.println("Enter the length of array");
        n= sc.nextInt();
        int[] array = new int[n];
        for(i=0;i<n;i++) {
            array[i] = sc.nextInt();
            sum += array[i];
        }
        System.out.println(sum);
    }
}
