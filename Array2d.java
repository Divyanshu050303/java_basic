package com.company;
import java.util.Scanner;
public class Array2d {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,m,i,j;
        System.out.println("Enter the row in the array");
        n= sc.nextInt();
        System.out.println("Enter the column in the array");
        m= sc.nextInt();
        int [][]array=new int[n][m];
        for(i=0;i<n;i++){
            for (j=0;j<m;j++){
                array[i][j]= sc.nextInt();
            }
        }
        for(i=0;i<n;i++){
            for (j=0;j<m;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
}
