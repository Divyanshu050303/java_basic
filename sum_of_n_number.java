package com.company;
import java.util.Scanner;
public class sum_of_n_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int n, i=0, sum=0;
        n= sc.nextInt();
        while (i<=n){
            sum+=i;
            i++;
        }
        System.out.println("the sum of entire number "+ sum);
    }
}
