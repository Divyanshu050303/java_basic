package com.company;
import java.util.Arrays;
import java.util.Scanner;
public class copy_array_in_new_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n, i;
        System.out.println("Enter the length of array");
        n=sc.nextInt();
        int []old_array=new int[n];
        int []new_arrray=new int[n];
        for (i=0;i<n;i++){
            old_array[i]= sc.nextInt();
        }
        System.out.println("This actual the array "+ Arrays.toString(old_array));
        for (i=0;i<n;i++){
            new_arrray[i]=old_array[i];
        }
        System.out.println("This the copied array "+Arrays.toString(new_arrray));
    }
}
