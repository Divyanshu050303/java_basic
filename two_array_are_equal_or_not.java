// this program check the two array is equal is or not
package com.company;
import java.util.Scanner;
class arrayEqual{
    int m, n, i, j, c=0;
    int []array1=new int[50];
    int []array2=new int[50];

    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of first array");
        n=sc.nextInt();
        System.out.println("Enter teh length of second array");
        m=sc.nextInt();
        System.out.println("Enter element in the first array");
        for(i=0;i<n;i++){
            array1[i]= sc.nextInt();
        }
        System.out.println("Enter element in tha second array");
        for(i=0;i<n;i++){
            array2[i]= sc.nextInt();
        }
    }
    public void print(){

        if (n==m){
            for ( i=0;i<n;i++) {
                for (j = 0; j < m; j++) {
                    if (array1[j] == array2[i]) {
                        c += 1;
                    }
                }
            }
            if (n==c){
                System.out.println("Both array is equal");
                }
            else {
                    System.out.println("Both array is not equal");
                }

        }
        else {
            System.out.println("Both the array is not equal");
        }
    }
}
public class two_array_are_equal_or_not {
    public static void main(String[] args) {
        arrayEqual eq=new arrayEqual();
        eq.input();
        eq.print();
    }
}
