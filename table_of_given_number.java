// this program is used to print the table of a given number
package com.company;
import java.util.Scanner;
public class table_of_given_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n, i;
        System.out.println("Enter the number which you want table");
        n= sc.nextInt();
        for (i=1; i<=10;i++){
            System.out.println(n+" X "+i+" = "+n*i);
        }
    }
}
