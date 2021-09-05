// this program show how the array contain the string
package com.company;
import java.util.Arrays;
import java.util.Scanner;
public class array_contain_string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n, i;
        System.out.println("Enter the length of array");
        String [] array=new String[n= sc.nextInt()];
        System.out.println("Enter the string in the ");
        for (i=0;i<n;i++){
            array[i]=sc.next();
        }
        System.out.println("Hear is your array contain string "+ Arrays.toString(array));

    }
}
