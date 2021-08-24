package com.company;
import java.util.Arrays;
import java.util.Scanner;
public class imsert_vlaue_in_the_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n, i, m, index;
        System.out.println("Enter the length of array");
        n= sc.nextInt();
        int []array=new int[n];
        for (i=0;i<n;i++){
            array[i]= sc.nextInt();
        }
        System.out.println("This is the actual array that you entered "+ Arrays.toString(array));
        System.out.println("Enter the number that you want to insert in the array");
        m= sc.nextInt();
        System.out.println("Enter the index ");
        index= sc.nextInt();
        for(i=n-1; i > m; i--){
            array[i] = array[i-1];
        }
        array[index] = m;
        System.out.println("After the insert your number the array is "+Arrays.toString(array));


    }
}
